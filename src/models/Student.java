package models;

public class Student extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 52372.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return STIPEND_AMOUNT;
        } else {
            return 0.00;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}