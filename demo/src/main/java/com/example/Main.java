package com.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("I'm ready!");
            multiplier();
            growSphere();
        }
    }

    public static void multiplier() {
        int number = 1;
        for (int i = 1; i <= 100; i++) {
            number *= i;
            System.out.println(number);
        }
    }

    public static void growSphere() {
        for (int i = 1; i <= 100; i++) {
            System.out.println((4/3)*Math.pow(i,3)*Math.PI);
        }
    }
}