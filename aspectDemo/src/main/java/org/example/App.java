package org.example;

import org.test.TimeTest1;

/**
 * Hello world!
 *
 */
public class App 
{

    @MyAnnotation
    public void myAnnotatedMethod() {
        System.out.println("Executing myAnnotatedMethod");
    }

    public static void main(String[] args) {
        System.out.println("主类main方法");
        TimeTest1 timeTest = new TimeTest1();
        timeTest.test();
        timeTest.testAndTest();
    }
}
