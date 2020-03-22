package studentdatabasesystem;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		//Asking how many new students we want to add
		System.out.print("Enter the number of new students to enroll: ");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for (int n = 0; n< numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}

	}

}
