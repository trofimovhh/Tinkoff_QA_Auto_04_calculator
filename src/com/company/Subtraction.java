package com.company;

public class Subtraction extends Operation {
    @Override
    public String execute(int a, int b) {
        int resultOfSubtraction = a - b;
        return String.valueOf(resultOfSubtraction);
    }
}
