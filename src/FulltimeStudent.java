
public class FulltimeStudent extends Student{
	private double tutionFees;													//declaring tutionFees variable

    /**
     * @return method ask user to input base fees and tuition fees if student is full time
     */
    @Override
    public void readInfo(){
    	super.readInfo();														//invoking readInfo method from super class
        System.out.print("Enter base fees: ");									//asking user to input base fees and then assign the input value
        baseFees = CollegeSystemTest.keys.nextDouble();
        System.out.print("Enter tuition fees: ");								//asking user to input tuition fees and then assign the input value
        tutionFees = CollegeSystemTest.keys.nextDouble();
    }

    /**
     * this method print detail of full time student in table form
     */
    @Override
    public void printInfo(){
        double totalFees = baseFees + tutionFees;								//declaring total fees variable and calculating total fees
        System.out.printf("%10s|%8d|%15s|%15s|%15d|%5.2f|%8.2f| %n",getProgramName(),getStudentNumber(),this.getName(),this.getEmail(),this.getPhoneNumber(),getGpa(),totalFees);
    }
}
