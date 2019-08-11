package com.wxx.bj.designpattern.sington;

/**
 * Sington.java
 * <p>
 * 单例模式
 * 1、只能有一个实例
 * 2、必须自己创建自己的实例
 * 3、必须给所有其他对象提供这个实例
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class Sington {
    /**
     * 类加载时，静态变量 single 会被实例化  【饿汉式单例】
     */
    public static Sington single = new Sington();

    /**
     * 私有的构造器
     */
    private Sington() {
        System.out.println("Sington开始实例化");
    }

    /**
     * 静态工厂方法
     *
     * @return
     */
    public static Sington getInstance() {
        return single;
    }
}
