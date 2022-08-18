package toll_Plaza;

public class User {
   
	//Checking whether Is Registered Or Non Registered
	public void checkUser()
	{
		Registered_User r1 = new Registered_User();
		r1.checkUser();
		
		if(r1.getCheck() == 0)
		{
			
			Non_Registerted_User n1 = new Non_Registerted_User();
			n1.checkUser();
			System.out.println(n1.getString());
		}
		
	}
	
	
}
