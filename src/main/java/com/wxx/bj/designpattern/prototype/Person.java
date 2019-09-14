package com.wxx.bj.designpattern.prototype;

/**
 * Person.java
 *
 * @author wangxinxin07
 * @date 2019/8/11
 */
public class Person implements Cloneable {
    private int age;
    private String name;
    private Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(12);
        person.setName("zhangsan");

        Address address = new Address();
        address.setProvinceName("江苏");
        address.setCityName("南京");
        person.setAddress(address);

        System.out.println(person);

        try {
            Person clonePerson = (Person) person.clone();
            System.out.println(clonePerson);

            System.out.println("person == clonePerson : " + (person == clonePerson));
            //默认浅克隆
            System.out.println("person.address == clonePerson.address : " + (person.getAddress() == clonePerson.getAddress()));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
