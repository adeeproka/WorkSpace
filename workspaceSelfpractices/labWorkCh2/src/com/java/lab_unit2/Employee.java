package com.java.lab_unit2;

 

public class Employee 
{
	private int identifier;
	private String name;
	private double salary;
	private String town;
	
	public Employee()
	{
		this.identifier = Input.getInteger("Enter the ID no:");
		this.name = Input.getString("Enter the Name:");
		this.salary = Input.getDouble("Enter Salary");
		this.town = Input.getString("Enter Town: ");
	}

	public int getIdentifier() {
		return identifier;
	}

	

	public String getName() {
		return name;
	}

	

	public double getSalary() {
		return salary;
	}

	

	public String getTown() {
		return town;
	}

	public String toString()
	{
		return "Identifier:" + this.identifier + "," + "Name:" + this.name + "," + "Salary:" + this.getSalary() + "," + "Town:" + this.getTown();
		
	}
	
	 
}
