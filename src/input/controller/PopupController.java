package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
<<<<<<< HEAD
	{
		//Get new name
=======
	{	
>>>>>>> origin/master
		String name = myPopups.getAnswer("Type in your name");
		myPopups.displayResponse("You typed in: " + name);
		
		//Get new age
		int age;
		String tempAge = myPopups.getAnswer("Enter you age");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("Enter a valid integer for 'age'");
		}
		
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = 0;
		}
		myPopups.displayResponse("You typed in " + age);
		
		//Get new weight
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Enter a valid double for 'weight'");
		}
		
		if(isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = 0;
		}
		myPopups.displayResponse("You typed in: " + weight);
		
		//Create new thing object with new values
		myThing = new Thing(name, age, weight);
		
		//Display info for the new thing object
		myPopups.displayResponse(myThing.toString());
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not type in a valid integer :(");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.displayResponse("You did not enter a valid double :(");
		}
		
		return isDouble;
	}
}
