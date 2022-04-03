package com.company;

public class Animal {

// 1. fields
    boolean hasTail; // true or false
    String name;
    int age;

// 2. constructor

    public Animal(boolean hasTail, String name, int age) {
        this.hasTail = hasTail;

        if (name.isEmpty()){ // ""
            this.name = "noname";
        }else{
            this.name = name;
        }

        if (age == 0){
            this.age = 1;
        }else{
            this.age = age;
        }
    }

// 3. methods (functions)

    public void makeSound(){
        System.out.println("animal makes sound");
    }

    public void stam(){
        System.out.println("stam");
    }

    @Override
    public String toString() {
        return "This animal's name is " + name;
    }
}
