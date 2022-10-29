package javaexamples;
import java.util.Scanner;
public class UserPassworddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password, confirm_password;  // we have created to variables to accept user input and store
		Scanner d = new Scanner(System.in); // Scanner for accepting input
		System.out.println("Enter your password :");
		password = d.next(); 		// First accepting the password
		System.out.println("Re-Enter your password :");
		confirm_password = d.next(); // Storing the re-entered password in confirm_password
		if (password .equals(confirm_password)) // Checking whether both the passwords match
		{
			System.out.println("Your password matched ");
			
		}
		else
			System.out.println("Your password Did not matched ");

	}

}
