package resources;

public class testData {
	
	//Registration Data
	
	public static String Firstname="Gaurav";
	public static String Lastname="Arundekar";
	public static String Telephone="0123456789";
	public static String Password="admin123";
	public static String ConfirmPassword="admin123";
	public static String EmailId="aknair@gmail.com";
	
	//Registration Expected
	public static String RegistrationSucessfulExpected="Your Account Has Been Created!";	
	public static String FirstnameExpected="First Name must be between 1 and 32 characters!";	
	public static String LastnameExpected="Last Name must be between 1 and 32 characters!";
	public static String EmailExpected="E-Mail Address does not appear to be valid!";
	public static String TelephoneExpected="Telephone must be between 3 and 32 characters!";
	public static String PasswordExpected="Password must be between 4 and 20 characters!";
	
	//Login Expected
	public static String LoginSucessfulExpected="My Account";
	public static String LoginFailedExpected="Warning: No match for E-Mail Address and/or Password.";
	
	
	

}
