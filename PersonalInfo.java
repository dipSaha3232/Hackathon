package serverPackage;

import java.io.Serializable;

public class PersonalInfo implements Serializable{
	
	private String name,father_name,mother_name,date_of_birth,address,reg,phn;
		
	public PersonalInfo(String name,String father_name,String mother_name,String date_of_birth
			,String address,String reg,String phn)
	{
		this.name=name;
		this.father_name=father_name;
		this.mother_name=mother_name;
		this.date_of_birth=date_of_birth;
		this.address=address;
		this.reg=reg;
		this.phn=phn;
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

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}
	
	public String getPhn()
	{
		return phn;
	}
	
	public void setPhn(String phn)
	{
		this.phn=phn;
	}

	public String toString()
	{
		return "Name :"+getName()+"\nFather's name :"+getFather_name()+
				"\nMother's name :"+getMother_name()+"\nDate of birth :"+getDate_of_birth()
		+"\nAddress :"+getAddress()+"\nPhone Number :"+getPhn();
	}

}
