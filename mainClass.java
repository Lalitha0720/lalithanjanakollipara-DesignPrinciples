package designPrinciples;
import java.io.*;
import java.util.Scanner;
public class mainClass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter your choice of operation to be performed:");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: add(x,y);
					break;
			case 2: sub(x,y);
					break;
			case 3: mul(x,y);
					break;
			case 4: div(x,y);
					break;
			case 5: mod(x,y);
					break;
			default : System.out.println("Choose from 1 to 5:");
					  break;
		}
	}
	static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	static void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	static void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	static void div(int x,int y)
	{
		System.out.println(x/y);
	}
	static void mod(int x,int y)
	{
		System.out.println(x%y);
	}
}