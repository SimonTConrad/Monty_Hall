import java.util.Random;
import java.util.Scanner;

public class Monty_Hall 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		
		int car = (r.nextInt(3)+1);
		
		System.out.println(car);
		
		System.out.println("You walk into a room with three doors. ");
		System.out.println("A very loud bodiless voice says to you,");
		System.out.println(" 'Behind one of these doors is a brand new car, ");
		System.out.println("however behind the other two is a simply a goat.'");
		System.out.print("Which door do you choose? : ");
		int choose = s.nextInt();
		if (choose > 3)
		{
			System.out.println("You must choose a number between 1-3!");
			System.out.print("Which door do you choose? : ");
			choose = s.nextInt();
		}
		else if (choose <= 0)
		{
			System.out.println("You must choose a number between 1-3!");
			System.out.println("Which door do you choose? : ");
			choose = s.nextInt();
		}
		if (choose == 1)
		{
			int goatDoor = 2;
			if (car == goatDoor)
			{
				goatDoor = 3;
			}
			System.out.println("Behind door #" + goatDoor + " there is a goat.");
			int switchDoor = 3;
			if (goatDoor == switchDoor)
			{
				switchDoor = 2;
			}
				System.out.print("Would you like to change your pick y/n? : ");
				char answer = s.next().charAt(0);
				
				switch (answer)
				{
					case 'y':
						System.out.println("You switched to door #" + switchDoor);
						choose = switchDoor;
						break;
					case 'n':
						System.out.println("You chose to stay at door #" + choose);
						break;
					default:
						System.out.println("You must choose either 'y' or 'n'!");
				}
				System.out.println("The car was behind door #" + car);
				if (choose == car)
					System.out.println("You won!");
				else if (choose != car)
					System.out.println("You lost.");
			}
			
		else if (choose == 2)//tell me the same stuff
			{
				int goatDoor = 3;
				if (car == goatDoor)
				{
					goatDoor = 1;	
				}
				System.out.println("Behind door #" + goatDoor + " there is a goat.");
				int switchDoor = 1;
				if (goatDoor == switchDoor)
				{
					switchDoor = 3;
				}
				System.out.print("Would you like to change your pick y/n? : ");
				char answer = s.next().charAt(0);
				
				switch (answer)
				{
					case 'y':
						System.out.println("You switched to door #" + switchDoor);
						choose = switchDoor;
						break;
					case 'n':
						System.out.println("You chose to stay at door #" + choose);
						break;
					default:
						System.out.println("You must choose either 'y' or 'n'!");
				}
				System.out.println("The car was behind door #" + car);
				if (choose == car)
					System.out.println("You won!");
				else if (choose != car)
					System.out.println("You lost.");
			}
			
				
		else if (choose == 3)
			{
				int goatDoor = 1;
				if (car == goatDoor)
				{
					goatDoor = 2;
				}
				System.out.println("Behind door #" + goatDoor + " there is a goat.");
				int switchDoor = 2;
				if (goatDoor == switchDoor)
				{
					switchDoor = 1;
				}
				System.out.print("Would you like to change your pick y/n? : ");
				char answer = s.next().charAt(0);
				
				switch (answer)
				{
					case 'y':
						System.out.println("You switched to door #" + switchDoor);
						choose = switchDoor;
						break;
					case 'n':
						System.out.println("You chose to stay at door #" + choose);
						break;
					default:
						System.out.println("You must choose either 'y' or 'n'!");
				}
				System.out.println("The car was behind door #" + car);
				if (choose == car)
					System.out.println("You won!");
				else if (choose != car)
					System.out.println("You lost.");
			}
		
		
	}

}	
