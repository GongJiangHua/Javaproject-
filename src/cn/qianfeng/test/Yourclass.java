package cn.qianfeng.test;

public class Yourclass extends Thread {
      private String name;
    //构造方法

    public Yourclass( String name) {
        this.name = name;
    }


    @Override
    public void run() {
       while (!(Demo01.UId==0)){
           Demo01.UId--;
           System.out.println(name+"的线程程序:"+Demo01.UId);
       }
    }
}
