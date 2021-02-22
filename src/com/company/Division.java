package com.company;

public class Division extends Operation {
    @Override
    public String execute(int a, int b) {
        double ad = a;
        double resultOfDivision = ad / b;
        return String.valueOf(resultOfDivision);
    }
}