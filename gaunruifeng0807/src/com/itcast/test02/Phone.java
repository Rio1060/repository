package com.itcast.test02;
/*
1.定义手机类：Phone（抽象类）
包含成员属性：名称：String name，价格 double price
提供GET/SET方方法和满参和无参构造方法
包含抽象成员方法;void song (String str)
2. 定义接口Bluetooth
包含午参无返回值的抽象方法void btFunction()；

 */
public abstract class Phone {
    private String name ;
    private double price;



    abstract void song (String str);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Phone() {

    }
}
