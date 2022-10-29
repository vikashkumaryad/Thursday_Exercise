package javaexamples;
import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value : ");
		n = s.nextInt();
		if (n % 2 == 0) 
			// the input of the user is stored in n..n is divided by 2 and if the remainder is 0 then it is even else odd
			System.out.println("The given number " + n + " is even");
		else
			System.out.println("The given number " + n + " is odd");
	}

	}


