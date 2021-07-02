package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment
// Write a program that takes a value from the user and
// prints out that number's position in fibonacci sequence.
// Fibonacci sequence is a series of numbers where the previous two numbers sum up
// to make the next number.
// In this case, take the first two numbers of the sequence to be 1, 1
// e.g. 1, 1, 2, 3, 5, 8, ...
// Enter the position you want: 4
// 3
        //SOLUTION
//request number from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of position in fibonacci sequence you want to observe: ");


        int n = scanner.nextInt();

//non recursive formula  (1+sqrt(5))^n - (1-sqrt(5))^n ) / (2^n * sqrt(5)

        double fibN = (Math.pow(1 + Math.sqrt(5),n) - Math.pow(1 - Math.sqrt(5),n))
                / (Math.pow(2, n) * Math.sqrt(5));

//print out answer

    System.out.println("the number you are seeking is: " + (int)fibN);






    }//End of void main
}
