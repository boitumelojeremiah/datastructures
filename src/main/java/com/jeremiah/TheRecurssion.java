package com.jeremiah;

public class TheRecurssion {
    public static void main(String[] args){
        walk(5);
        System.out.println("Factorial method output: "+factorial(7));
        System.out.println("Power method output: "+power(2,8));
    }
    public static void walk(int steps){
        if(steps < 1) return; //base case
        System.out.println("I take step number: "+steps);
        walk(steps-1); //recursive case
    }
    private static int factorial(int num){
        if (num < 1) return 1; //base case
        return num * factorial(num - 1); //recursive case
    }
    private static int power(int base, int exponent){
        if (exponent < 1) return 1;
        return base * power(base, exponent-1);
    }
}
