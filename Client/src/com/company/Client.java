package com.company;
import com.myrmi.Calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args)
            throws NotBoundException, RemoteException,
            MalformedURLException {
        String url = "//localhost:1099/Calc";
        Calculator Q = (Calculator) Naming.lookup(url);
        System.out.println("RMI object found");
        int x = Q.sum(10, 20);
        int y = Q.sub(10, 4);
        System.out.println(x);
        System.out.println(y);
    }
}