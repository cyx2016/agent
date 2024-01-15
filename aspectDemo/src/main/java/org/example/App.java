package org.example;

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
        TimeTest timeTest = new TimeTest();
        timeTest.test();
        timeTest.testAndTest();
    }
}
