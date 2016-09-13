package org.anzo;


public class FibWhile {

    private int i = 0;
    private int a = 1;
    private int b = 1;

    public int fibWhile(int n) {


        int sum_fib = 1;
        while (i++ < n - 2) {

            sum_fib = a + b;
            a = b;
            b = sum_fib;
        }
        return sum_fib;
    }
}