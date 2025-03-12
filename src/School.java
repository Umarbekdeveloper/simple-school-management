public class School {
    private Teacher[] teachers;
    private Student[] students;
    private  int teacherCount =0;
    private  int studentCount =0;

    public School() {
        this.teachers = new Teacher[100];
        this.students = new Student[100];
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public double getTotalMoneyEarned(){
        double totalMoneyEarned = 0;
        for (int i = 0; i < studentCount; i++) {
            totalMoneyEarned+=students[i].getFeesPaid();
        }
        return totalMoneyEarned;
    }

    public double getTotalMoneySpent(){
        double totalMoneySpent = 0;
        for (int i = 0; i < teacherCount; i++) {
            totalMoneySpent+=teachers[i].getSalaryEarned();
        }
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher){
        teachers[teacherCount++]=teacher;
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        students[studentCount++]=student;
        student.setSchool(this);
    }
}
