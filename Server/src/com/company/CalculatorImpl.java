package com.company;

import com.myrmi.Calculator;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImpl extends UnicastRemoteObject
        implements Calculator {
    public CalculatorImpl() throws RemoteException {
        super();
    }
    public int sum(int x, int y) throws RemoteException {
        return x+y;
    }
    public int sub(int x, int y) throws RemoteException {
        return x-y;
    }
}