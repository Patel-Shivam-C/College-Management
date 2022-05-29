
public class Person {
	protected String firstName;												//declaring instance variable name firstName
    protected String lastName;												//declaring instance variable name lastName
    protected String email;													//declaring instance variable name email
    protected long phoneNumber;												//declaring instance variable name phoneNumber

    public Person(){}

    /**
     *
     * @param name1: person's first name
     * @param name2: person's last name
     * @param eId: person's email
     * @param cellNum: person's contact number
     */
    public Person(String name1,String name2, String eId, long cellNum){		//creating parameterized constructor
        this.firstName = name1;
        this.lastName = name2;
        this.email = eId;
        this.phoneNumber = cellNum;
    }

    /**
     *
     * @return: Person's name as a string
     */
    public String getName(){												//getter for name and return first name last name in string format
        return this.firstName + " "+this.lastName;
    }

    /**
     *
     * @return: person's email
     */
    public String getEmail(){												//getter for email id
        return email;
    }

    /**
     *
     * @return: person's cell number
     */
    public long getPhoneNumber(){											//getter for phone number
        return phoneNumber;
    }
}
