package cn.qianfeng.test;

/**
 * 1.创建一个线程类？直接继承Thread类
 * 2.
 *
 *
 * 1.解决问题：
 * 1.1操作的数据如果赋值 数据会错误
 * 1.2多线程启动注意，不要直接调用run方法
 *
 *
 */

public class Demo01 {
    public static long UId = 100;
    public static void main(String[] args) {
        /*Myclass Mc = new Myclass();
        Yourclass Yc = new Yourclass();
        Mc.start();
        Yc.start();*/
        Yourclass yourclass1 = new Yourclass("小龚");
        Yourclass yourclass2 = new Yourclass("小彭");
        Yourclass yourclass3 = new Yourclass("小邹");
//        yourclass1.run();
//        yourclass2.run();
//        yourclass3.run();
        yourclass1.start();
        yourclass2.start();
        yourclass3.start();
    }
}
