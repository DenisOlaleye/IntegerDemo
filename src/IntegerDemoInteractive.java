import java.util.Scanner;


public class IntegerDemoInteractive 
{
	
	public static void main (String [] args)
	{
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		anInt = input.nextInt();
		System.out.print("Please enter a byte >> ");
		aByte = input.nextByte();
		System.out.print("Please enter a short >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long >> ");
		aLong = input.nextLong();
		input.nextLine();
		System.out.print("Please enter your name >> ");
		name = input.nextLine();
		System.out.println("Thank you " +name);
		
				
		System.out.println("The int is   " +anInt);
		System.out.println("The byte is  " +aByte);
		System.out.println("The short is " +aShort);
		System.out.println("The long is  " +aLong);
			}
	

}
