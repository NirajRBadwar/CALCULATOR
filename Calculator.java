package CAL_use_java;

import java.util.Scanner;

public class Calculator {
	
	

	
	public static void main(String arg[])
	{
		
 
		char operator;
		float number1,number2,result;
		
		System.out.println("SELECT THE OPERATION YOU WANT TO DO :");
		System.out.println(" + "+" - "+" * "+" / ");
		Scanner s=new Scanner(System.in);
		operator=s.next().charAt(0);
		
		System.out.println("ENTER THE FIRST NUMBER : ");
		Scanner num1=new Scanner(System.in);
		number1=num1.nextFloat();
		
		System.out.println("ENTER THE SECOND NUMBER : ");
		Scanner num2=new Scanner(System.in);
		number2=num2.nextFloat();		
		
		switch(operator)
		{
		case '+':
			result=number1+number2;
			System.out.println(" THE ADDITION OF THE TWO NUMBERS IS :"+result);
		break;
		
		case '-':
			result=number1-number2;
			System.out.println(" THE SUBSTRACTION OF THE TWO NUMBERS IS :"+result);
		break;
		
		case '*':
			result=number1*number2;
			System.out.println(" THE MULTIPLICATION OF THE TWO NUMBERS IS :"+result);
		break;
		
		case '/':
			result=number1/number2;
			System.out.println(" THE DIVISION OF THE TWO NUMBERS IS :"+result);
		break;
		
		default:
			System.out.println(" INVALID CHARACTER INSERTED ");
			break;
		}
		
		
		
		
		
	}
	
	
	

}
