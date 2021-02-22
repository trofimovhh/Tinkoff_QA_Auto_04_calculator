package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String instruction = "Input two numbers and an operation in between, for example: 2+3, then press <Enter>" + '\n' +
                "There are 4 operations available: +, -, \\, *" + "\n" +
                "In order to close program just type EXIT" + "\n" +
                "Your input is: ";
        System.out.println(instruction);
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();
        while (!myString.equals("EXIT")) {
            String answer = new Operation().Calculate(myString);
            System.out.println("Your answer is: " + answer);
            System.out.println(instruction);
            myString = in.nextLine();
        }

        in.close();
    }
}