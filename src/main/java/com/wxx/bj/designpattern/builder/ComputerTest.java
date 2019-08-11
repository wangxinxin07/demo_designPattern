package com.wxx.bj.designpattern.builder;

/**
 * ComputerTest.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = Computer.builder("cpu111", "ram222").setDisplay("三星显示器").setKeyboard("华硕键盘").build();
        System.out.println(computer);
    }
}
