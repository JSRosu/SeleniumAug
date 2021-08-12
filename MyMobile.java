package week1.day2;

// Subject: Mobile

public class MyMobile {

	// variables/attributes/properties
	
	int screenSize = 12;
	int cost;
	char logo;
	long mobNum;
	boolean isTouchScreen;
	String brandName;
	float amps = 1.4f;

	// methods syntax - signature of a method
	  //Access modifier returntype methodName (arguments){method body}
	
	public String makeCalls()
       {
		String callMsg = "Hello";
		System.out.println("Making calls");
		return callMsg;
	
		}
	public void takePics()
	{
		System.out.println("Taking pictures");
	}
	private void payMoney()	{
		System.out.println("Making payments");
	}
	
	public void makeSMS(String sms)
	{
		System.out.println("sms : " + sms);
	}
	public static void main(String[] args) {

		// access the class variables and methods
		// create an object --> INSTANTIATE (CREATING AN INSTANCE)
		// COPY OF AN OBJECT 
		// creating an object for the class
		// syntax: 
		// mobObj can be Samsung, iphn, etc for this eg, many objs can be created and used for a class
		// classname objectname = new Constructor;
		MyMobile mobObj = new MyMobile();
		mobObj.takePics();
		
		String makeCalls = mobObj.makeCalls();
		System.out.println(makeCalls);
		
		mobObj.makeSMS(makeCalls);
		mobObj.payMoney();
		// CTRL + 1
		// return value
		int screenSize2 = mobObj.screenSize; // assigning to a vairable
		System.out.println("Screensize: " + screenSize2);
		
		
	
	}
	
	}

