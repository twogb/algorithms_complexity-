package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
    public static int fibonacciFor(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;

        for (int i = 1; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        memo.put(n, fib);
        return fib;
    }

}

