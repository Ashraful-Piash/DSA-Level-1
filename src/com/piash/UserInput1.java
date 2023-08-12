package com.piash;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name: ");
        String name = scanner.nextLine();

        System.out.println("Dear " + name + " . Here is the counting: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
