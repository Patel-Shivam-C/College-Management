
public class Student extends Person {
	private int studentNumber;																//declaring student number variable
    private String programName;																//declaring program name variable
    private double gpa;																		//declaring gpa variable
    protected double baseFees;																//declaring protected base fees variable. Protected because it is need in subclasses

    /**
     * Default constructor
     */
    public Student() {}

    /**
     * @param studentId get student Id
     * @param progName get Program name
     * @param marks get student's marks in all courses
     * @param baseFees get base fees
     * @param nameF get student's first name
     * @param nameL get student's last name
     * @param email get student's email
     * @param contactNum get student's contact number
     */
    public Student(int studentId, String progName, double marks,
    		double baseFees, String nameF, String nameL, String email, long contactNum) {
        super(nameF, nameL, email, contactNum);
        this.studentNumber = studentId;
        this.programName =  progName;
        this.gpa = marks;
        this.baseFees = baseFees;
    }

    /**
     * readInfo() method to set and get a student details receive from user.
     */
    public void readInfo(){
        System.out.print("Enter program name: "+CollegeSystemTest.keys.nextLine());				//asking user to input program name and then assign the input value
        programName = CollegeSystemTest.keys.nextLine();
        System.out.print("Enter student number: ");												//asking user to input student number and then assign the input value
        studentNumber = CollegeSystemTest.keys.nextInt();
        System.out.print("Enter first name: "+CollegeSystemTest.keys.nextLine());				//asking user to input student first name and then assign the input value
        firstName = CollegeSystemTest.keys.nextLine();
        System.out.print("Enter last name: ");													//asking user to input student last name and then assign the input value
        lastName = CollegeSystemTest.keys.nextLine();
        System.out.print("Enter email Id: ");													//asking user to input student email ID and then assign the input value
        email = CollegeSystemTest.keys.nextLine();
        System.out.print("Enter phone number: ");												//asking user to input student phone number and then assign the input value
        phoneNumber = CollegeSystemTest.keys.nextLong();
        readMarks();																			//invoking readMarks() method
    }

    /**
     * readMarks() method to get marks of each course
     */
    private void readMarks(){
        int[] numberOfCourse;																	//declaring array to get number of course student did
        System.out.print("Enter number of course: ");											//asking user to input how many course student did and then assign the input value to an array
        int courses = CollegeSystemTest.keys.nextInt();
        numberOfCourse = new int[courses];
        for (int i=0;i<numberOfCourse.length;i++){												//In for loop, asking user to input marks of each course
            System.out.print("Enter marks "+(i+1)+": ");
            numberOfCourse[i] = CollegeSystemTest.keys.nextInt();
        }
        calculateGpa(numberOfCourse); 															//invoking calculateGpa method and assigning the value of numberOfCourse array in parenthesis
    }

    /**
     * This method accept an array from readMarks() method
     * calaulateGpa() method to get a gpa of student
     * @param numberOfCourse: get number of courses student did
     */
    private void calculateGpa(int[] numberOfCourse) {
    	double total = 0;																		//declaring total variable to find the average gpa
    	for(int i=0;i<numberOfCourse.length;i++){
    		total = total + numberOfCourse[i];
        }
    	double MAX_MARKS = total/(numberOfCourse.length*100);           						//Math formula to find an average gpa and at the assign value to an gpa variable
        double MAX_GPA = MAX_MARKS*4;
        gpa = MAX_GPA;
    }

    /**
     * printInfo() method is print detail of student in the form of table.
     */
    public void printInfo() {
        System.out.printf("%10s|%8d|%15s|%15s|%15d|%5.2f| %n",programName,studentNumber,this.getName(),this.getEmail(),this.getPhoneNumber(),gpa);
    }

    public int getStudentNumber() {																//getter for student number variable
    	return studentNumber;
    }

    public String getProgramName() {															//getter for program name variable
    	return programName;
    }

    public double getGpa() {																	//getter for gpa variable
    	return gpa;
    }
}
