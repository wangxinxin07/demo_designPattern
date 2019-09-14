package com.wxx.bj.designpattern.prototype;

/**
 * Address.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class Address {
    private String provinceName;

    private String cityName;

    @Override
    public String toString() {
        return "Address{" +
                "provinceName='" + provinceName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
