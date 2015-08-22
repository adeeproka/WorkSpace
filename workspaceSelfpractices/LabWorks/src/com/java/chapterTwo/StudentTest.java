package com.java.chapterTwo;

public class StudentTest
{
	public static void main(String []args)
	{
		int option;
		
		do {
				StudentList student =  new StudentList();
				
				System.out.println("0:Exit \n1:Add Student \n2:Display all students \n3:Display by Grades \n4:Display by Town");
				System.out.println("==================");
				
				option = Input.getInteger("Select a number");
				
				switch(option)
				{
				case 0: 
				{
					System.out.println("Exit!!");
					break;
				}
				case 1: 
				{
					student.add();
					break;
				}
				
				case 2:
				{
					student.display();
					break;
				}
				case 3:
				{
					student.displayByGrades();
					break;
				}
				case 4:
				{
					student.displayByTown();
					break;
				}
				
				default:
					System.out.println("Invalid Entry, Try again!!");
				
				}
	
			}while(option!=0);
	
	}
	
}
