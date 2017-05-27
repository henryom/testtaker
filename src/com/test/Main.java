package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type test to print a file.  Type read to read into an array.  Type create to create a test.");
        String command = scanner.nextLine();
        command = command.toLowerCase();
        switch (command) {
            case "test":
                test();
                break;
            case "read":
                read();
                break;
            case "create":
                create();
                break;
            default:
                System.out.println("No command named: " + command + " Type help for help.");
        }
        scanner.close();
    }

    private static void test() {
        System.out.println("test");
    }


    private static void read() {
        System.out.println("read");
    }

    private static void create() {
        System.out.println("create");
    }
}

