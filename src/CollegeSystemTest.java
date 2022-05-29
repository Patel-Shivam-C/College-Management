
import java.util.Scanner;
public class CollegeSystemTest {

	static Scanner keys = new Scanner(System.in);
	public static void main(String[] args) {
		String collegeName;																//declaring college name variable
        int numOfStudent;																//declaring number of student variable
        System.out.print("Enter name of college: ");									//asking user to enter college name and assign the input value
        collegeName = keys.nextLine();
        System.out.print("Enter numbers of students: ");								//asking user to enter number of student and assign the input value
        numOfStudent = keys.nextInt();
        College college = new College(collegeName, numOfStudent);						//declaring college class object and assigning collegeName and numberOfStudent values
        System.out.println("1. Add a student");
        System.out.println("2. Print all Students");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");										//asking user to choose an option and declaring option variable and assign the input value
        int option = keys.nextInt();
        while (option > -1){															//while loop for user to decide what he/she wants to do add, print or exit.
        	if (option<1||option>3) {													//if user enter any number rather than 1,2 or 3.
            	System.out.println("***** Invalid option.. Please try again *****");	//Program give an error message and allow user another chance to make a selection.
            	System.out.println("1. Add a student");
                System.out.println("2. Print all Students");
                System.out.println("3. Exit");
                System.out.print("Enter your option: ");
                option = keys.nextInt();
            }else
            if (option == 1) {															//if user select 1, then program invoke method from college and read student detail base on the student type selection.
            	college.ReadStudentsDetails();											//and then again give a chance to user to make selection.
            	System.out.println("1. Add a student");
                System.out.println("2. Print all Students");
                System.out.println("3. Exit");
                System.out.print("Enter your option: ");
                option = keys.nextInt();
            }else
            if (option == 2) {															//if user select 2, then program invoke method from college class to print student detail.
            	college.printStudentDetail();											//no matter how much array is filled
            	System.out.println("1. Add a student");									//and then again give a chance to user to make selection.
                System.out.println("2. Print all Students");
                System.out.println("3. Exit");
                System.out.print("Enter your option: ");
                option = keys.nextInt();
            }else
            if (option == 3) {															//if user decide to exit program if give nice goodbye message and program name
            	System.out.println("Goodbye... Have a nice day \r\nProgram developed by Shivam Patel");
            	break;
            }
        }
        keys.close();

	}

}
