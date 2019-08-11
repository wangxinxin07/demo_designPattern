package com.wxx.bj.designpattern.sington;

/**
 * SingtonInnerClass.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class SingtonInnerClass {

    private SingtonInnerClass() {
    }

    public static SingtonInnerClass getInstance() {
        return Builder.instance;
    }

    static class Builder {
        public static SingtonInnerClass instance = new SingtonInnerClass();
    }

}
