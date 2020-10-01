package jspdemo;

public class Student {
	
	private String eMail;
	private String firstName;
	private String lastName;
	
	public Student (String eMail, String firstName, String lastName) {
		
		this.eMail = eMail;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}	
	
	public String getEMail () {
		return this.eMail;
	}
	
	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
	
}
