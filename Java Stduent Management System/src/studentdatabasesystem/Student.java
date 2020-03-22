package studentdatabasesystem;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String studentID;
	private int gradeYear;
	private int tuitionBalance = 0;
	private String courses = "";
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = input.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student class level: ");
		this.gradeYear = input.nextInt();
		
		setStudentID();
		}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Leel + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}
		while (1!= 0);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
			}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
		
		}
	
	// Show Status
	public String toString() {
		
		return "Student's Details are below: " + "\nName: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID + "\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
