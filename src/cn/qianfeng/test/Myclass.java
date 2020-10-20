package cn.qianfeng.test;
//一个线程类
public class Myclass extends Thread {
    @Override
    //线程启动时执行的代码
    public void run() {
        while (!(Demo01.UId==0)){
            Demo01.UId --;
            System.out.println("我的线程程序:"+Demo01.UId);
        }
    }
}
//123455