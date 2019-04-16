package serverPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IITServer {
	
	DataInputStream din;
    DataOutputStream dout;
    ServerSocket ss;
    
    String name,father_name,mother_name,date_of_birth,address,reg,phn,session,sem,year,hall,roll,
	nid,password;
	
	public void get_certificate()
	{
		
	}
	
	public void insert_account_info()
	{
		
	}
	
	public void insert_personal_info() throws IOException
	{
		Scanner input=new Scanner(System.in);
		
		dout.writeUTF("Enter your name : ");
		name=input.nextLine();
		
		dout.writeUTF("Enter your father's name : ");
		father_name=input.nextLine();
		
		dout.writeUTF("Enter your mother's name : ");
		mother_name=input.nextLine();
		
		dout.writeUTF("Enter your date of birth : ");
		date_of_birth=input.nextLine();
		
		dout.writeUTF("Enter your address : ");
		address=input.nextLine();
		
		dout.writeUTF("Enter your phone number : ");
		phn=input.nextLine();
		
		PersonalInfo personalInfo=new PersonalInfo(name, father_name, mother_name, date_of_birth, address, reg, phn);
		SerializeToFile serializeToFile=new SerializeToFile();
		serializeToFile.writeSerializeObject(personalInfo);
	}
	
	public void insert_academic_info() throws IOException
	{
		Scanner input=new Scanner(System.in);
		
		dout.writeUTF("Enter your regestration number : ");
		reg=input.nextLine();
		
		dout.writeUTF("Enter your roll number : ");
		roll=input.nextLine();
		
		dout.writeUTF("Enter your session : ");
		session=input.nextLine();
		
		dout.writeUTF("Enter your current year : ");
		year=input.nextLine();
		
		dout.writeUTF("Enter your current semester : ");
		sem=input.nextLine();
		
		AcademicInfo academicInfo=new AcademicInfo(reg, session, sem, year, hall, roll);
		
		SerializeToFile serializeToFile=new SerializeToFile();
		serializeToFile.writeSerializeObject(academicInfo);
		
	}
    
    public void initialize()
    {
    	System.out.println("welcome to server");
	    ss= null;
	    try {
	        ss = new ServerSocket(33332);
	        Socket s=ss.accept();
	
	        din =new DataInputStream(s.getInputStream());
	        dout=new DataOutputStream(s.getOutputStream());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    }
    
    
    public void menu()
    {
	    initialize();
	    
	    while (true)
        {
            try
            {
               
                dout.writeUTF("Enter what you want to do.\n" +
                        "1. Get Certificate\n" +
                        "2. Insert Student Information\n" +
                        "3. Update Student Information\n" +
                        "4. Exit");


                int choice=Integer.parseInt(din.readUTF());
                
                if(choice==1)
                {
                	
                }
                else if(choice==2)
                {
                	insert_personal_info();
                	insert_academic_info();
                }
             }
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer only.");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
         }
                
    }

}
