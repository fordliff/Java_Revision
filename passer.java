public class passer
{
	//get 

	//Access
	static int dob;
	static String myfullname;

	public static String getUserdetails()
	{
		//String Getdob = String.valueOfof(dob);
		String Details = myfullname ;//+  Getdob;

		String rst;
		rst = String.valueOf(dob);

		return Details + rst + " years";
	}
	
	public static void main(String[] args)
	{
		System.out.println("What is your name");
		inputyourname("Clifford");
		myfullname= "Great Name ";
		dob =150;
		inputyourname(getUserdetails());
	}

	public static String inputyourname(String fullname)
	{
		 System.out.println("My name is : " + fullname);

		 return fullname;
	}
	

}