package org.anzo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;


public class MyStart {

    public static void main(String[] args) throws IOException {

        FibRec frec = new FibRec();
        FibWhile fw = new FibWhile();
        System.out.println(frec.fibRec(6));
        System.out.println(fw.fibWhile(6));


    }


}

