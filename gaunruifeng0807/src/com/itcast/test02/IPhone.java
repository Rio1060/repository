package com.itcast.test02;
/*
要求：
1.	继承Phone（手机类），实现song方法，要求打印“XXX手机正在播放音乐YY”（其中XXX为手机名称，YY当前方法的参数）
2.	提供空参满参数构造；
3.	实现Bluetooth接口，实现btFunction()方法，在方法中打印“XXX正在连接蓝牙”（XXX为手机名称）
4.	创建成员方法run();里面分别掉用song(String str)方法和btFunction方法，其中song方法中的参数自行创建；

 */
public class IPhone extends Phone implements Bluetooth{
    public IPhone(String name, double price) {
        super(name, price);
    }

    public IPhone() {
    }
        void run(){
            song("单身情歌");
            btFunction();
        }
    @Override
    void song(String str) {
        System.out.println(getName()+"手机正在播放音乐"+str);
    }

    @Override
    public void btFunction() {
        System.out.println(getName()+"正在连接蓝牙");
    }
}
