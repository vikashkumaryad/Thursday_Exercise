// Himanshu gaurav Toppo - Dated:3 November Lab Programs//
package Thursday_Lab2;

import java.util.Scanner;

public class swap {
//we need three variables a,b and a temporary variable
	public static void main(String[]args) {
		int var1;
		int var2;
		int temp;
		System.out.println("Enter the variables to be swapped");
		Scanner sc=new Scanner(System.in);
		//we are taking number from user//
		System.out.print("Enter first number- ");  
		  var1= sc.nextInt();  
		System.out.print("Enter second number- ");  
		  var2= sc.nextInt();  
		System.out.println("The number before swapping are:"+var1+" "+var2);
		//logic behind the program //
		temp = var1;
		var1 = var2;
		var2 = temp;
		// logic explanation-> given 10 20 as example when temp variable gets value 10 
		//and then 10 is given to variable 2 hence variable 2 has 10 and variable 2 
		//original value i.e 20 is placed to variable1  //
		System.out.println("After swapping:"+var1+" "+var2);
		
		
	}
}
