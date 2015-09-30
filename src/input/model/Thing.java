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
		name = "";
		age = 0;
		weight = 0.0;
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
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getWeight()
	{
		return this.weight;
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
