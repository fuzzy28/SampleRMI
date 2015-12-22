package org.jrue.sample.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServerImpl extends UnicastRemoteObject implements RMIServer {
	
	private static final long serialVersionUID = 1L;
	
	protected RMIServerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String name) {
		if(name != null && name.length() > 0) {
			return "Hello " + name + "!";
		}
		return "Hello Anonymous!";
	}

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		RMIServerImpl rmi = new RMIServerImpl();
		Registry registry = LocateRegistry.createRegistry(Constants.RMI_PORT);
		registry.bind(Constants.RMI_NAME, rmi);
		System.out.println("Server listening");
	}
}
