package exceptionhanding1;

import java.util.Scanner;

public class AgeException extends Exception {
	
	AgeException(String message){
		super(message);
	}
	

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();*/
		int age = 0;
		try {
		
		checkAge(age);
		}
		catch(Exception e) {
			System.out.println("A problem occured: "+e);
			
		}
	}
		
		static void checkAge(int are) throws AgeException{
			int age = 7;
			if(age<18) {
				throw new AgeException("\n" + "You must be 18+ to sign up");
			}
			else {System.out.println("you are now sign up");
			}
		

	
	}
}
