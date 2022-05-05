package com.company;

public class Cat {
    private String name;
    private int age;
    private String color;
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
        if (age < 0) {
            System.out.println("Error the age Cat!");
        }else
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void catmethod(String name) {
        System.out.println("Кошку зовут " + name + " Она любит спать!");
    }
}
