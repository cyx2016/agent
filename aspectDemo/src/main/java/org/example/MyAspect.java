package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("@annotation(myAnnotation)")  // 在方法执行前执行
    public void beforeMyAnnotation(MyAnnotation myAnnotation) {
        System.out.println("Before method with MyAnnotation");
        // 在这里添加你的切面逻辑
    }
}
