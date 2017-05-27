package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type TEST to print a file.  Type READ to read into an array.  Type CREATE to create a test.");
        String command = scanner.nextLine();
    }
}
