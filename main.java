package toll_Plaza;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Registered_User r1 = new Registered_User("Aditya","0001","12/05/22","Paid","Car","0151111");
		Registered_User r2 = new Registered_User("Ramesh","0002","11/05/22","Paid","Bike","0150030");
		Registered_User r3 = new Registered_User("John","0003","13/05/22","NonPaid","Car","0181111");
		Registered_User r4 = new Registered_User("Khan","0004","14/05/22","Paid","Truck","01911424");
		Registered_User r5 = new Registered_User("Birla","0005","17/05/22","NonPaid","Car","0141111");
		// Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Registered_User> names = new ArrayList<Registered_User>();
 
        // Adding objects to the ArrayList
        names.add(r1);
        names.add(r2);
        names.add(r3);
        names.add(r4);
        names.add(r5);
        //System.out.println(names.get(0).getNo_Plate());  
        
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter user car number");  
        String str= sc.nextLine(); 
        String str1 = "";
        int check;
        //String str1 = names.get(0).getNo_Plate();
        
        for(int i=0;i<names.size();i++)
        { 
        	 str1 = names.get(i).getNo_Plate();
        	
        	
            if(str.equals(str1)) 
           {
        	  System.out.println("Registered User Found");
        	  check +=1;
        	  break;
           }
            else
            {	
            	System.out.println(i);
            	
            }
            
            
              
           
        
        }  
        
        if(check > 0)
        {
        	System.out.println("Registerted User Found");
        }
        else
        {
        	System.out.println("No Registerted User Found");
        }
        
        */
		
		
		User r1 = new User();
		r1.checkUser();
      
       

	}

}
