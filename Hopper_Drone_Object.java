//Author Name: Zachary Hopper
//Date: 5/15/2020
//Program Name: Drone
//Purpose: Drone class used to store information regarding position along the x, y, and z axes as well as orientation.

package Drone;

public class Hopper_Drone_Object
{
	private int xCoordinate = 0;
	private int yCoordinate = 0;
	private int zCoordinate = 0;

	private int orientation = 0;
	private String[] compass = {"North", "East", "South", "West"};
	/* orientation is an int so turnLeft and turnRight methods can simply
	 * increment and decrement in most cases.
	 * 0 = North, 1 = East, 2 = South, 3 = West
	 * compass[orientation] will translate the numerical value stored in int
	 * into a cardinal direction to be read by humans. */

	public int getX()
	{
		return xCoordinate;
	}

	public int getY()
	{
		return yCoordinate;
	}

	public int getZ()
	{
		return zCoordinate;
	}

	public String direction()
	{
		return compass[orientation];
	}

	public void incrementX()
	{
		xCoordinate++;
	}

	public void decrementX()
	{
		xCoordinate--;
	}

	public void incrementY()
	{
		yCoordinate++;
	}

	public void decrementY()
	{
		yCoordinate--;
	}

	public void incrementZ()
	{
		zCoordinate++;
	}

	public void decrementZ()
	{
		zCoordinate--;
	}

	public void moveForward()
	{
		if (orientation == 0)
			incrementY();
		else if (orientation == 1)
			incrementX();
		else if (orientation == 2)
			decrementY();
		else if (orientation == 3)
			decrementX();
	}

	public void moveBackward()
	{
		if (orientation == 0)
			decrementY();
		else if (orientation == 1)
			decrementX();
		else if (orientation == 2)
			incrementY();
		else if (orientation == 3)
			incrementX();
	}

	public void turnLeft()
	{
		if (orientation == 0)
			orientation = 3;
		else
			orientation--;
	}

	public void turnRight()
	{
		if (orientation == 3)
			orientation = 0;
		else
			orientation++;
	}

	@Override
	public String toString()
	{
		return "Hopper_Drone [x_pos=" + getX() + ", y_pos=" + getY() + ", z_pos=" + getZ() + ", orientation=" + direction() + "]";
	}
}