package com.company;

public class Fish {
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
            System.out.println("Error the age Fish!");
        }else
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void fishmethod(String name) {
        System.out.println("Рыбу зовут " + name + " Постоянно хочет кушать!");
    }
}
