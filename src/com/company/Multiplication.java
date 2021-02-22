package com.company;

public class Multiplication extends Operation {
    @Override
    public String execute(int a, int b) {
        int resultOfMultiplication = a * b;
        return String.valueOf(resultOfMultiplication);
    }
}
