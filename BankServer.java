package serverPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BankServer {
	
	DataInputStream din;
    DataOutputStream dout;
    ServerSocket ss;
    
    public void initialize()
    {
    	System.out.println("welcome to server");
	    ss= null;
	    try {
	        ss = new ServerSocket(30000);
	        Socket s=ss.accept();
	
	        din =new DataInputStream(s.getInputStream());
	        dout=new DataOutputStream(s.getOutputStream());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    }
    
    public void menu(int choice)
    {
    	 try
         {
            if(choice==1)
            {
            	
            }
         }
    }

}
