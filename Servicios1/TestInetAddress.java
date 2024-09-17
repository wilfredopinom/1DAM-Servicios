package Servicios1;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
public static void main(String[] args) {
	InetAddress dir=null;
	System.out.println("============================");
	System.out.println("SALIDA PARA LOCAL HOST");
	
	try {
		//LOCALHOST
		dir=InetAddress.getByName("LAPTOP-MU3MN71B");
		
		MetodosInetAddres.pruebaMetodos(dir);//
		
		//URL www.google.com
		System.out.println("==============================");
		System.out.println("SALIDA PARA UNA URL");
		dir=InetAddress.getByName("www.google.com");
		MetodosInetAddres.pruebaMetodos(dir);//
		
		//Array de tipo inetAddres con todas las direcciones IP asignadas a google.es
		System.out.println("\tDIRECCIONES IP PARA :" + dir.getHostName());
		InetAddress[]direcciones=
				InetAddress.getAllByName(dir.getHostName());
		System.out.println("====================array==============");
		for (int i = 0; i < direcciones.length; i++)
			
	
			System.out. println("\t\t"+direcciones[i]. toString() );
			System.out.println("================================");
			
	}catch (UnknownHostException e1) {e1.printStackTrace();
	}
					// main
	
		
}}

	

