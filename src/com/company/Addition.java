package com.company;

class Addition extends Operation {
    @Override
    public String execute(int a, int b) {
        int resultOfAddition = a + b;
        return String.valueOf(resultOfAddition);
    }
}
