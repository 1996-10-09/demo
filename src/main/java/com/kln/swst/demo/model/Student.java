package com.kln.swst.demo.model;

public class Student {

    private String name;
    private String adress;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if(age>100 || age<=0){
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }
}
