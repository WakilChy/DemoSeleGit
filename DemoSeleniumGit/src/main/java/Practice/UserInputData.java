package Practice;

import java.util.Scanner;

public class UserInputData {

	public static void main(String[] args) {
		
		Scanner myname = new Scanner(System.in);  // Create a Scanner object
	    
		
		System.out.println("Enter username : ");
	    String fname=myname.nextLine();
	    
	    System.out.println("Enter lastName : ");
	    String lname=myname.nextLine();
	    
	    
	    System.out.println(fname+" "+lname);
	    
	    
	    
	    //Scanner sum = new Scanner(System.in);  // Create a Scanner object
	    
		
		System.out.println("Enter FirstNum : ");
	    int num1=myname.nextInt();
	    
	    System.out.println("Enter SecondNum : ");
	    int num2=myname.nextInt();
	    
	    
	    System.out.println(num1+num2);

	}

}
