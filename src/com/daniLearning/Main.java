package com.daniLearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int value = 0;

        System.out.print("Value: ");
        value = scanner.nextInt();


        if ((value%10) == 0 || (value%5 == 0)) {

            System.out.print("Fizz");

        }

        if ((value%3) == 0) {

            System.out.print("buzz");

        } else if ((value%5) != 0){

            System.out.print(value);

            }


    }
}
