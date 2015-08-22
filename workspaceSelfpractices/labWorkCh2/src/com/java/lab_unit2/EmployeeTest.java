package com.java.lab_unit2;



public class EmployeeTest {

	public static void main(String[] args) 
	{ 
		int option;
		
		
		
			EmployeeList employees = new EmployeeList();
			
		do{
			System.out.println("1.Add \n2.Display List \n3.Display by Salary \n4.Display by Town");
			
			option = Input.getInteger("Enter the Option: ");
			
			switch(option)
			{
			case 1:
				{
					employees.add();
					break;
				}
				
			case 2:
			{
				employees.display();
				break;
			}
			case 3:
			{
				employees.displayBySalary();
				break;
			}
			case 4:
			{
				employees.displayByTown();
				break;
			}
			case 0:
				break;
				
				default:
					System.out.println("Invalid Entry! please enter desired option again.");
			
			}
		}while(option !=0);

	}

}
