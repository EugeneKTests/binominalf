package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(binominal(11, 5));
    }

    private static long factorial(long n) {
        if (n < 0) {
            throw new ArithmeticException("n is negative");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static long binominal(long n, long k) {
        return multiply(n, k) / factorial(n - k);
    }

    private static long multiply(long n, long k) {
        long result = 1;
        for (long i = k + 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
