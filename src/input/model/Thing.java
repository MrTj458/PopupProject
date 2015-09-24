package input.model;

/**
 * The object that holds the name, age, and weight for the 'Thing' object.
 * @author thod0127
 * @version 1.0 9/24/15
 */
public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	public Thing()
	{
		age = -99;
		weight = -.0000005;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String toString()
	{
		String thingInfo = name + " is " + age + " years old, and weighs " + weight + "lbs.";
		return thingInfo;
	}
}
