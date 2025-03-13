package entities;

import library.StudentList;
import library.TeacherList;

public class School {
    private TeacherList teachers;
    private StudentList students;

    public School() {
        this.teachers = new TeacherList();
        this.students = new StudentList();
    }

    public TeacherList getTeachers() {
        return teachers;
    }

    public StudentList getStudents() {
        return students;
    }

    public double getTotalMoneyEarned(){
        double totalMoneyEarned = 0;
        for (int i = 0; i < students.size(); i++) {
            totalMoneyEarned+=students.get(i).getFeesPaid();
        }
        return totalMoneyEarned;
    }

    public double getTotalMoneySpent(){
        double totalMoneySpent = 0;
        for (int i = 0; i < teachers.size() ; i++) {
            totalMoneySpent+=teachers.get(i).getSalaryEarned();
        }
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        students.add(student);
        student.setSchool(this);
    }
}
