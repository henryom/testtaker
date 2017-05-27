package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type TEST to print a file.  Type READ to read into an array.  Type CREATE to create a test.");
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

    }


=======
    private static void read() {

    }

    private static void create() {

    }
}
>>>>>>> 516deadfffbc7d7a25917cc900ea7aaaba750921
