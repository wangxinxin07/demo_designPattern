package com.wxx.bj.designpattern.sington;

import com.alibaba.fastjson.JSON;

/**
 * SingtonCopy.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class SingtonCopy {

    public static void main(String[] args) {
        Sington instance = Sington.getInstance();
        System.out.println(instance);

        String instanceStr = JSON.toJSONString(instance);
        System.out.println("instanceStr = " + instanceStr);

        Sington sington = JSON.parseObject(instanceStr, Sington.class);
        System.out.println(sington);

    }
}
