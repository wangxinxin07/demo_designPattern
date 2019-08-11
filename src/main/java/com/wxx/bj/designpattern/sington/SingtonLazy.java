package com.wxx.bj.designpattern.sington;

import java.util.ArrayList;
import java.util.List;

/**
 * SingtonLazy.java
 * 懒汉式单例
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class SingtonLazy {

    private volatile static SingtonLazy single;

    /**
     * 私有构造器
     */
    private SingtonLazy() {
        System.out.println("SingtonLazy开始实例化");
        int total = 0;
        for (int i = 0; i < 100000; i++) {
            total++;
        }
        System.out.println("SingtonLazy完成实例化");
    }

    /**
     * 第一次调用getInstance时完成实例化
     * 【使用synchronize修饰以处理多线程环境】
     *
     * @return
     */
    public synchronized static SingtonLazy getInstance() {
        if (single == null) {
            single = new SingtonLazy();
        }
        return single;
    }

    /**
     * 双重检查成例
     *
     * @return
     */
    public static SingtonLazy getInstance2() {
        if (single == null) {
            synchronized (SingtonLazy.class) {
                if (single == null) {
                    single = new SingtonLazy();
                }
            }
        }
        return single;
    }

    /**
     *
     */
    public void gogogo() {
//        System.out.println("1111111111111111");
    }


    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    SingtonLazy.getInstance2().gogogo();
                }
            });
            threadList.add(t);
        }
        for (Thread thread : threadList) {
            thread.start();
        }
    }
}
