package com.java.dp;

public class Fibonacci {

    public static int fibonacciRecursive(int number){
        if(number == 0 || number == 1)
            return number;
        return fibonacciRecursive(number - 1) +  fibonacciRecursive(number - 2);
    }

    public static int fibonacciI(int n){
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for(int i = 2; i <= n; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args){
        System.out.println("fibonacci of 5 = " + fibonacciRecursive(6));
        System.out.println("fibonacci of 5 = " + fibonacciI(6));
    }
}
