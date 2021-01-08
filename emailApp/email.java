package emailApp;
import java.util.*;
public class email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10;
	private String department;
	private String Email;
	private String companySuffix="abccompany.com";
	private int mailboxCapaity=500;
	private String alternateEmail;
	
	//constructor to recieve the first name and last name
	public email(String firstname, String lastname)
	{
		this.firstName=firstname;
		this.lastName=lastname;
		System.out.println("EMAIL CREATED: "+ this.firstName+ " "+this.lastName);
		
		//call a method to which ask for department and return department
		this.department=setDepartment();
		//System.out.println("Department: "+this.department);
		
		//call a method that return random password
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("password: "+this.password);
		
		//concatenate all information to create email
		Email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department+"."+ companySuffix;
		//System.out.println("Email: "+this.Email);
	}
	//Ask for the department
	private String setDepartment()
	{
		System.out.print("DEPARTMENT CODES \n1 Sales \n2 Development \n3 Accounting \n0 None\nEnter department code: ");
		Scanner scan= new Scanner(System.in);
		int choice=scan.nextInt();
		scan.close();
		if(choice==1)return "Sales";
		else if(choice==2)return "Dev";
		else if(choice==3)return "Acc";
		else return "";
	}
	
	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char [] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapaity=capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
		//System.out.println(this.alternateEmail);
	}
	
	//change the password
	public void changePassword(String newPass)
	{
		this.password=newPass;
	}
	
	//get methods
	public int getMailboxCapacity() {return mailboxCapaity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;	}
	
	//writing a method to show info
	public void showInfo()
	{
		System.out.println("NAME: "+this.firstName+" "+this.lastName);
		System.out.println("EMAIL: "+this.Email);
		System.out.println("MAIL BOX CAPACITY: "+this.mailboxCapaity);
	}
	
	
}
