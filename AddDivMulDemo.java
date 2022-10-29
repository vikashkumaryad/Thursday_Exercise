package javaexamples;
import java.util.Scanner;

public class AddDivMulDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add,div,mod,mul; // Creating Variables for addition, division, multiplication and modulus 
		add=8+2345; // 8 is added to 2345 and stored in add
		div=add/3;  // the result of add is divided by 3 and stored in div
		mod=div%5;  // the result of div is performed with modulus operator and stored in mod
		mul=mod*5;  // and lastly the result of mod is multiplied by 5 and stored in mul
		System.out.println(mul);
		System.out.println((((8+2345)/3)%5)*5); // this similar to the operations performed above
	}

	}


