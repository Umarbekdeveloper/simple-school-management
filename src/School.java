public class School {
    private Teacher[] teachers;
    private Student[] students;
    private  int teacherCount =0;
    private  int studentCount =0;

    public School() {
        this.teachers = new Teacher[10];
        this.students = new Student[10];
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
        if (teacherCount>=teachers.length){
            Teacher[] temp = new Teacher[teachers.length*2];
            for (int i = 0; i < temp.length; i++) {
                temp[i]=teachers[i];
            }
            teachers=temp;
        }
        teachers[teacherCount++]=teacher;
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        if (studentCount>=students.length){
            Student[] temp = new Student[students.length*2];
            for (int i = 0; i < temp.length; i++) {
                temp[i]=students[i];
            }
            students=temp;
        }
        students[studentCount++]=student;
        student.setSchool(this);
    }
}
