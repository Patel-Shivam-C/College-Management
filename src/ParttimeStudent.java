
public class ParttimeStudent extends Student{
	private double courseFeesTotal;												//declaring course fees total variable
    private double credits;														//declaring credit varibale

    /**
     * this method ask user to input base fees and tuition fees if student is part time
     */
    @Override
    public void readInfo(){
    	super.readInfo();														//invoking readInfo method from super class
        System.out.print("Enter base fees: ");									//asking user to input base fees and then assign the input value
        baseFees = CollegeSystemTest.keys.nextDouble();
        System.out.print("Enter course fees: ");								//asking user to input course fees and then assign the input value
        courseFeesTotal = CollegeSystemTest.keys.nextDouble();
        System.out.print("Enter credit hours: ");								//asking user to input credit hours and then assign the input value
        credits = CollegeSystemTest.keys.nextDouble();
    }

    /**
     * this method print detail of part time student in table form
     */
    @Override
    public void printInfo(){
        double totalFees = baseFees + (courseFeesTotal*credits);				//declaring total fees variable and calculating total fees
        System.out.printf("%10s|%8d|%15s|%15s|%15d|%5.2f|%8.2f|%8.2f| %n",getProgramName(),getStudentNumber(),this.getName(),this.getEmail(),this.getPhoneNumber(),getGpa(),totalFees,credits);
    }
}
