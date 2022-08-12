package toll_Plaza;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registered_User r1 = new Registered_User("Aditya","1234","12/05/22","Paid","Car","0151111");
       
 
        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Registered_User> names = new ArrayList<Registered_User>();
 
        // Adding objects to the ArrayList
        names.add(r1);
        //System.out.println(names.get(0).getNo_Plate());  
        
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter user car number");  
        String str= sc.nextLine(); 
        String str1 = names.get(0).getNo_Plate();
        
        
        if(str.equals(str1)) 
        {
        	System.out.println("Registerted user found");
        }
        else
        {
        	System.out.println(" NO Registerted user");
        }
        
        
        
      
       

	}

}
