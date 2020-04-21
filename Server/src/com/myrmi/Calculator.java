package com.myrmi;
import java.rmi.*;

public interface Calculator extends Remote {
    public int sum(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
}