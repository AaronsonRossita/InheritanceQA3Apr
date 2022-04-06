package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        double y = 3.2;

        String s = "%^&45678";
        char c = 'c';

        final String web = "www.google.com";

        String[] arr = {"abc","def","ghi"};
        String[] arrEmpty = new String[4];

        Object object1 = new Object();

        Animal animal1 = new Animal(false,"",0);
        Cat cat1 = new Cat("Zina",8,9);
        Dog dog1 = new Dog("Tair",12,true);

//        System.out.println(animal1);
//        System.out.println(cat1);
//        System.out.println(dog1);
//        System.out.println(animal1.toString());
//        System.out.println(animal1);
//
//        System.out.println(cat1);
//        animal1.makeSound();
//        cat1.makeSound();
//        dog1.makeSound();
//
//                    0  1  2  3  4
//
//        print(5);
//        print(web);
//        if (x > 6){
//            System.out.println("x is bigger than 6");
//        }else if (x == 6){
//            System.out.println("x equals 6");
//        }else{
//            System.out.println("x is smaller than 6");
//        }
//
//        System.out.println("the end");

// for each only for array

        for (String word : arr){ // 1. word = "abc" 2. word = "def" 3. word = "ghi"
            System.out.println(word);
        }

        for (int i = 0; i < arrEmpty.length; i++) {
            // i < arrEmpty.length
            System.out.println(arrEmpty[i]);
            // i++
        }

        while(x > 1){
            System.out.println("something");
            x--;
        }

        print(5,10);
    }

// Overload
    public static void print(int x){
        System.out.println(x*2);
    }

    public static void print(String x){
        System.out.println(x + x);
    }

    public static void print(int number, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(number);
        }
    }


}
