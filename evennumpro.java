package javabasicsprogram;

import java.util.Scanner;

public class evennumpro {

	public static void main(String[] args) {
		
		Scanner myobj=new Scanner (System.in); //user input
		
		System.out.println("please Enter Number: ");
		
		// Numerical Input
		int num=myobj.nextInt();

		//int num=18;
		
		if (num%2==0)
		{
			System.out.println("Number is Even "+ num);
		}
		else
			System.out.println("Number is odd "+ num);
	}

}
