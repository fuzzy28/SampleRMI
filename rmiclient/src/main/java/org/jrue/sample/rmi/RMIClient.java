package org.jrue.sample.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient 
{
    public static void main( String[] args ) throws RemoteException, NotBoundException
    {
       Registry registry = LocateRegistry.getRegistry(Constants.RMI_PORT);
       RMIServer server =  (RMIServer) registry.lookup(Constants.RMI_NAME);
       System.out.println(server.sayHello(null));
       System.out.println(server.sayHello("Joel"));
    }
}
