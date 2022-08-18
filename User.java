package toll_Plaza;

import java.util.Scanner;

public class User {
   
	 String str0="";
	//Checking whether Is Registered Or Non Registered
	public void checkUser()
	{  
		
		
	while(!str0.equals("NO"))
	{	
		Registered_User r1 = new Registered_User();
		
		r1.checkUser();
		
		if(r1.getCheck() == 0)
		{
			
			Non_Registerted_User n1 = new Non_Registerted_User();
			n1.checkUser();
			System.out.println(n1.getString());
		}
		
	 System.out.println("Do You Want To Check Vehicle Number YES/NO");
	 Scanner sc= new Scanner(System.in);
	  str0= sc.nextLine();
	}
	
	System.out.println("ThankYou For Using Toll-Managment System");
		
	}
	
	
}
