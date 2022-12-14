package com.startjava.Lesson_2_3_4.animal;

public class Wolf {

    private String gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("walks");
    }

    public void sit(){
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void howl() {
        System.out.println("howls");
    }

    public void hunt() {
        System.out.println("hunts");
    }
}