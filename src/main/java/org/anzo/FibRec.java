package org.anzo;

public class FibRec {


    public int fibRec(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }
}
