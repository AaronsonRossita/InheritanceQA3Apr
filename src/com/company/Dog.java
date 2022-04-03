package com.company;

public class Dog extends Animal {


    boolean hasLeash;

    public Dog(String name, int age, boolean hasLeash) {
        super(true, name, age);
        this.hasLeash = hasLeash;
    }

    @Override
    public void makeSound() {
        System.out.println("dog is braking");
    }

    @Override
    public String toString() {
        //     Animal.toString = "This animal's name is " + name
        return super.toString() + " and it's a dog and leash is = " + hasLeash;
    }
}
