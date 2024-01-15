package org.example;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class MyTransformer implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
        String realClassName = className.replaceAll("/", ".");

        if (realClassName.contains("org.test")) {
            CtClass ctClass;
            try {
                ClassPool classPool = ClassPool.getDefault();
                ctClass = classPool.get(realClassName);
                CtMethod[] declaredMethods = ctClass.getDeclaredMethods();
                for (CtMethod declaredMethod : declaredMethods) {
                    declaredMethod.addLocalVariable("time", CtClass.longType);


                    declaredMethod.insertBefore("System.out.println(\"---------Before----------\");");
                    declaredMethod.insertBefore("time = System.currentTimeMillis();");

                    declaredMethod.insertAfter("System.out.println(\"---------after----------\");");
                    declaredMethod.insertAfter("System.out.println(System.currentTimeMillis() - time);");
                }

                return ctClass.toBytecode();
            } catch (Throwable e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return classfileBuffer;
    }
}

