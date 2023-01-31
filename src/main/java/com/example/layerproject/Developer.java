package com.example.layerproject;

import com.sun.jdi.event.StepEvent;

public class Developer {

    private String name;
    private int dev_Id;
    private int age;
    private String role;
    private int salary;

    public Developer(String name, int age, String role, int salary, int dev_Id) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.dev_Id = dev_Id;
    }

    public int getDev_Id() {
        return dev_Id;
    }

    public void setDev_Id(int dev_Id) {
        this.dev_Id = dev_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
