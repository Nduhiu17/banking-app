package com.banking.system;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
//        int a = scanner.nextInt();
//        System.out.println("value = " + a);
        char c = scanner.next().charAt(3);
        System.out.println("c = " + c);
    }

}
