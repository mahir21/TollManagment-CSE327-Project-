package toll_Plaza;

import java.util.ArrayList;
import java.util.Scanner;

public class Non_Registerted_User extends User{
  
	private String Name;
	private String Date;
	private String Pay_Status;
	private String Vehicle;
	private String Phone;
	String str0,str1,str2,str3,str4,str5;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNo_Plate() {
		return No_Plate;
	}
	public void setNo_Plate(String no_Plate) {
		No_Plate = no_Plate;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getPay_Status() {
		return Pay_Status;
	}
	public void setPay_Status(String pay_Status) {
		Pay_Status = pay_Status;
	}
	public String getVehicle() {
		return Vehicle;
	}
	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	private String No_Plate;
	public Non_Registerted_User(String name, String no_Plate, String date, String pay_Status, String vehicle,
			String phone) {
		super();
		Name = name;
		No_Plate = no_Plate;
		Date = date;
		Pay_Status = pay_Status;
		Vehicle = vehicle;
		Phone = phone;
	}
	
	public Non_Registerted_User() {
		// TODO Auto-generated constructor stub
	}
	//It will take entry of user details of non-registerted user in toll plaza system.
	@Override
	public void checkUser()
	{   
		 
		 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	     System.out.print("Enter User Name");  
	     str0= sc.nextLine(); 
	     //System.in is a standard input stream  
	     System.out.print("Enter User Car Number");  
	     str1= sc.nextLine(); 
	     //System.in is a standard input stream  
	     System.out.print("Enter User Date");  
	     str2= sc.nextLine(); 
	     
	     System.out.print("Enter Payment");  
	     str3= sc.nextLine(); 
	     
	     System.out.print("Enter Vehicle");  
	     str4= sc.nextLine(); 
	     
	     System.out.print("Enter Phone Number");  
	     str5= sc.nextLine(); 
	     
	     
	     Non_Registerted_User n1 = new Non_Registerted_User(str0,str1,str2,str3,str4,str5);
	     
	     ArrayList<Non_Registerted_User> names = new ArrayList<Non_Registerted_User>();
		  
	     names.add(n1);
	    

	    
	     
	}
	
	//This method will display the print the user Values.
	public String getString()
	{
		return "name = " + str0 + " " + "number plate = " +str1 + " " + "registration date = " + str2 + " " + "payment status = "+ str3 + " vehicle type = " + str4 + " phone number = " + str5 ;
	}
	
}
