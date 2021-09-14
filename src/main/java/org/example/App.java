package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first number?");
        String numberOne = sc.nextLine();
        System.out.println("What is the second number?");
        String numberTwo = sc.nextLine();

        Integer one = Integer.valueOf(numberOne);
        Integer two = Integer.valueOf(numberTwo);

        String equations = String.format("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d \n", one, two, (one+two), one, two, (one-two), one, two, (one*two), one, two, (one/two));
        System.out.println(equations);

    }
}