package serverPackage;

import java.io.Serializable;

public class Account implements Serializable{
	
	private String name,father_name,mother_name,phn,nid,password,account_number;
	public static int numberOfUser=0;
	public double balance=0;
	
	public Account(String name,String father_name,String mother_name,String nid,String phn,String password
			,double balance)
	{
		this.name=name;
		this.father_name=father_name;
		this.mother_name=mother_name;
		this.nid=nid;
		this.phn=phn;
		this.password=password;
		this.balance=balance;
		numberOfUser++;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount_number() {
		return account_number;
	}

	private void setAccount_number() {
		this.account_number = Integer.toString(numberOfUser+10000000);
	}

}
