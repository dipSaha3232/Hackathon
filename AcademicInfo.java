package serverPackage;

import java.io.Serializable;

public class AcademicInfo implements Serializable{
	
	private String reg,session,sem,year,hall,roll;
	
	public AcademicInfo(String reg,String session,String sem,String year,String hall,String roll)
	{
		this.reg=reg;
		this.session=session;
		this.sem=sem;
		this.year=year;
		this.hall=hall;
		this.roll=roll;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getHall() {
		return hall;
	}

	public void setHall(String hall) {
		this.hall = hall;
	}
	
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public String toString()
	{
		return "regestration number :"+getReg()+"\nSession :"+getSession()+"\nSemester :"
				+getSem()+"\nYear :"+getYear()+"\nHall :"+getHall()+"\nRoll :"+getRoll();
	}

}
