package com.piash;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();


        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 80) {
            System.out.println("Good");
        } else if (marks >= 70) {
            System.out.println("Fair");
        } else if (marks >= 60) {
            System.out.println("Meets Expectation");
        } else {
            System.out.println("Below par");
        }
    }
}
