//Author Name: Zachary Hopper
//Date: 5/15/2020
//Program Name: Hopper_Drone
//Purpose: Simulation of the movement of a drone along the x, y, and z axes.

package Drone;

import java.util.*;

public class Hopper_Drone
{

	public static void main(String[] args)
	{
		Hopper_Drone_Object drone = new Hopper_Drone_Object();

		int menu = 0;
		Scanner input = new Scanner (System.in);

		while (menu != 8)
		{
			System.out.println("Which direction would you like to move the drone?");
			System.out.println("1 - Move Up");
			System.out.println("2 - Move Down");
			System.out.println("3 - Move Forward");
			System.out.println("4 - Move Backward");
			System.out.println("5 - Turn Left");
			System.out.println("6 - Turn Right");
			System.out.println("7 - Display Position");
			System.out.println("8 - Exit Navigation");

			try
			{
				menu = input.nextInt();

				if (menu == 1)
				{
					drone.incrementZ();
					System.out.println("You have moved up.");
				}

				else if (menu == 2)
				{
					drone.decrementZ();
					System.out.println("You have moved down.");
				}

				else if (menu == 3)
				{
					drone.moveForward();
					System.out.println("You have moved forward.");
				}

				else if (menu == 4)
				{
					drone.moveBackward();
					System.out.println("You have moved backward.");
				}
				else if (menu == 5)
				{
					drone.turnLeft();
					System.out.println("You have turned left.");
				}
				else if (menu == 6)
				{
					drone.turnRight();
					System.out.println("You have turned right.");
				}
				else if (menu == 7)
					System.out.println(drone.toString());

				else if (menu != 8)
				{
					System.out.println("Invalid input. Please enter a number between 1 and 8.");
					input.nextLine();
				}
			}

			catch(InputMismatchException ex)
			{
				System.out.println("Invalid input. Please enter a number between 1 and 8.");
				input.nextLine();
			}
		}
		input.close();
	}
}
