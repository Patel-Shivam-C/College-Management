
public class College {
	private String name;																//declaring name variable
    private Student[] students;															//declaring student class array
    private int count;																	//declaring count variable

    /**
     * Parameterized constructor
     * @param collegeName: get college name
     * @param count: get number of student
     */
    public College(String collegeName, int count){
        this.name = collegeName;
        students = new Student[count];
    }

    /**
     * printTitle() method get college name in from user and make header for an output
     */
    public void printTitle(){
        System.out.printf("%s - List of Students %n", name);							//printing name it receives from user
        System.out.println("***************************************************");
        System.out.printf("%10s|%s|%15s|%15s|%15s|%5s|%8s|%5s| %n","Program","Student#","Name","Email","Phone","GPA","Fees","Credits");
    }

    /**
     * ReadStudentsDetails() method decide which student (part time or full time) is selected and base on the selection this method acts
     */
    public void ReadStudentsDetails(){
        if (count>-1&&count<=(students.length-1)) {										//declaring if statement for program to get know that array is full or empty or not full
        	System.out.println("Enter detail of student "+(count+1));
        	System.out.println("===================================");
        	System.out.println("1 - Fulltime student");
            System.out.println("2 - Parttime student");
            System.out.print("Enter Student type: ");
            int studenttype = CollegeSystemTest.keys.nextInt();
            while (studenttype > -1){													//while loop for deciding which student is selected, full time or part time
                while (studenttype <1||studenttype >2) {								//another while loop for use to enter any number. If user any number rather than 1 or 2.
                	System.out.println("Wrong student type");							//Program print out error message and give user another chance to make a selection.
                    System.out.println("1 - Fulltime student");
                    System.out.println("2 - Parttime student");
                    System.out.print("Enter Student type: ");
                    studenttype = CollegeSystemTest.keys.nextInt();
                }
                if (studenttype==1) {													//if user enter number 1. Program invoke readInfo method from full time student class
                	students[count] = new FulltimeStudent();
                	students[count].readInfo();
                }
                if (studenttype==2){													//if user enter number 2. Program invoke readInfo method from part time student class
                	students[count] = new ParttimeStudent();
                	students[count].readInfo();
                }
                break;
            }
            count++;
        }else {
        	System.out.println("Array is full... cannot add more students");		 	//if array is full, it print out this method
        }
    }

    /**
     * printStudentDetail() method used to print student in table form
     */
    public void printStudentDetail(){
        if (count<=0){																	//if array is empty then program print out the error message
        	System.out.println("****** No students to print ******");
        }
        else {																			//if array full or at least contain one student info array. Program print it out in table form
        	printTitle();
        	for(int i=0;i<students.length;i++){
        		if(students[i] != null) {
        			students[i].printInfo();
        		}else {
        			break;
        		}
        	}
        }
    }
}
