package school.management.system;

/**
 * Created by Paris Higgins.
 * This class is responsible for keeping track of the students.
 * the role of the constructor [public Student(x,y,z) is to create a new student object by initialising the values
 * * - creates a new student objects
 * * - fees for every student is 30k per year
 * *
 * * setters should always be void and getters should always return a data type
 * * - updateFeesPaid --> same as setFeesPaid
 * *
 **/


public class Student {

    //fields
    private int id; // want to protect someone from accessing this id.
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0; //the *this* here is optional
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    //setter
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }


    // a way to represent an object
    // returns a readable object with the name id and totalfeespaid of a student
    @Override
    public String toString() {
        return "Student's name: " + name +
                ". Total Fee's Paid so far: £" + feesPaid;
    }
}
