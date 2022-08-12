package toll_Plaza;

import java.util.ArrayList;
import java.util.Scanner;

public class Registered_User  extends User{
   
	private String Name;
	private String No_Plate;
	private String Date;
	private String Pay_Status;
	private String Vehicle;
	private String Phone;
	
	public Registered_User(String name, String no_Plate, String date, String pay_Status, String vehicle, String phone) {
		super();
		Name = name;
		No_Plate = no_Plate;
		Date = date;
		Pay_Status = pay_Status;
		Vehicle = vehicle;
		Phone = phone;
	}
	
	//Creating a empty constructor to call constructor that doesn't require variables
	
	public Registered_User() {
		// TODO Auto-generated constructor stub
	}

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
	 
    
    //Method To check Whether the user is stored or not
	//In Registered User Method 
	@Override
	public void  checkUser()
	{
		Registered_User r1 = new Registered_User("Aditya","0001","12/05/22","Paid","Car","0151111");
		Registered_User r2 = new Registered_User("Ramesh","0002","11/05/22","Paid","Bike","0150030");
		Registered_User r3 = new Registered_User("John","0003","13/05/22","NonPaid","Car","0181111");
		Registered_User r4 = new Registered_User("Khan","0004","14/05/22","Paid","Truck","01911424");
		Registered_User r5 = new Registered_User("Birla","0005","17/05/22","NonPaid","Car","0141111");
		
		
		 ArrayList<Registered_User> names = new ArrayList<Registered_User>();
		 
	     // Adding objects to the ArrayList
	     names.add(r1);
	     names.add(r2);
	     names.add(r3);
	     names.add(r4);
	     names.add(r5);
	
	
	
		 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	     System.out.print("Enter user car number");  
	     String str= sc.nextLine(); 
	     String str1 = "";
	     int check = 0;
	    
	     for(int i=0 ;i<names.size();i++)
	        { 
	        	 str1 = names.get(i).getNo_Plate();
	        	 
	        	 
	        	//System.out.println(str1);
	            if(str.equals(str1)) 
	           {
	             
	        	 //Check Variable Is Used To Check Register User Exsits Or Not
	             // if Check is > 0 print User found orElse Print User NotFound
	            	
	        	  check+=1;
	        	  
	           }
	            
	       } 
	     
	     
	     // if Check is > 0 print User found orElse Print User NotFound   
	        if(check > 0)
	        {
	        	System.out.println("Registerted User Found");
	        }
	        
	        else
	        {
	        	System.out.println("No Registerted User Found");
	        }
	        
	      
		
	}

	
	
	
	
	
}
