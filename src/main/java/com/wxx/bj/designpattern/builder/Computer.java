package com.wxx.bj.designpattern.builder;

/**
 * Computer.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class Computer {
    /**
     * cpu 必须
     */
    private String cpu;
    /**
     * ram 必须
     */
    private String ram;

    private String keyboard;

    private String display;

    private Computer(String cpu, String ram, String keyboard, String display) {
        this.cpu = cpu;
        this.ram = ram;
        this.keyboard = keyboard;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public static Builder builder(String cpu, String ram) {
        return new Builder(cpu, ram);
    }


    static class Builder {
        /**
         * cpu 必须
         */
        private String cpu;
        /**
         * ram 必须
         */
        private String ram;

        private String keyboard;

        private String display;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Computer build() {
            return new Computer(this.cpu, this.ram, this.keyboard, this.display);
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }
}
