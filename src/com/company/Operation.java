package com.company;

import java.util.Scanner;

class Operation {
    public String Calculate(String myString) {
        String[] myStringArray;
        if (myString.matches("\\d+[\\\\+\\-\\*]\\d+")) {
            myStringArray = myString.split("[\\\\+\\-\\*]", 2);
        } else {
            return "Bad input, mate! Try again!";
        }
        int a = Integer.parseInt(myStringArray[0]);
        int b = Integer.parseInt(myStringArray[1]);
        String myOperation = myString.substring(myStringArray[0].length(), myStringArray[0].length() + 1);
        String result = "";
        switch (myOperation) {
            case "+":
                result = new Addition().execute(a, b);
                break;
            case "-":
                result = new Subtraction().execute(a, b);
                break;
            case "\\":
                result = new Division().execute(a, b);
                break;
            case "*":
                result = new Multiplication().execute(a, b);
                break;
            default:
                System.out.println("Restart this program and try again!");
                break;
        }
        String answer = String.valueOf(result);
        return answer;
    }

    public String execute(int a, int b) {
        return ("do something with " + a + " and " + b);
    }
}
