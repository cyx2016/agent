package org.example;

import java.lang.instrument.Instrumentation;

public class JavaAgent {
    /***
     * 在pom.xml中配置<Premain-Class>
     * 该方法就会在main方法之前运行
     * @param arg
     * @param instrumentation
     */
    public static void premain(String arg, Instrumentation instrumentation) {
        System.out.println("cyx:==========================================================");
        System.out.println("agent的premain(String arg, Instrumentation instrumentation)方法");
        instrumentation.addTransformer(new MyTransformer());
    }
}
