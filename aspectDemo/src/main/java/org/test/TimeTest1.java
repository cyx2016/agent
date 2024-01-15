package org.test;

public class TimeTest1 {

    public void test() {
        System.out.println("开始执行TimeTest1.test");
        System.out.println("sleep开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep结束");
    }

    public void testAndTest() {
        System.out.println("开始执行TimeTest1.testAndTest");
        System.out.println("sleep开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep结束");
    }
}
