package input.model;

/**
 * Contains all of the code for the 'Thing' object.
 * @author thod0127
 * @version 1.0 9/24/15
 */
public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * Sets default values if values are not given when the object is created.
	 */
	public Thing()
	{
		name = "";
		age = 0;
		weight = 0.0;
	}
	
	/**
	 * Sets the values given to the values in the object on creation.
	 * @param name
	 * @param age
	 * @param weight
	 */
	public Thing(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	/**
	 * Displays all of the variables from the object as a String to be viewed by the user.
	 */
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old, and weighs " + weight + "lbs.";
		return thingInfo;
	}
	
	//Getters
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
}
