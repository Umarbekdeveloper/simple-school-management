package entities;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid;
    private double feesTotal;
    private School school;

    public Student(int id, String firstName, String lastName, int grade, double feesTotal) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
        feesPaid = 0;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void pay(double fees){
        feesPaid+=fees;
    }

    @Override
    public String toString() {
        return "entities.Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                ", school=" + school +
                '}';
    }
}
