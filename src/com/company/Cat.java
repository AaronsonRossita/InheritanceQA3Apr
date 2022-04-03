package com.company;

public class Cat extends Animal{

    int lives;

    public Cat(String name, int age, int lives) {
        super(true, name, age);
        this.lives = lives;
    }

    @Override
    public void makeSound() {
        System.out.println("cat is meowing");
    }

    @Override
    public String toString() {
        return super.toString() + " and it's a cat and it has " + lives + " lives";
    }
}
