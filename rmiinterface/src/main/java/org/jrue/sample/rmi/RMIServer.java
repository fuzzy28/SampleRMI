package org.jrue.sample.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIServer extends Remote {

	String sayHello(String name) throws RemoteException;
}
