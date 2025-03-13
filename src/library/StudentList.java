package library;

import entities.Student;

public class StudentList {
    private Student[] students;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public StudentList() {
        students = new Student[DEFAULT_CAPACITY];
    }

    public StudentList(int capacity) {
        students = new Student[capacity];
    }

    public Student add(Student student){
        if (size>=students.length){
            Student[] temp = new Student[students.length*2];
            System.arraycopy(students,0,temp,0,students.length);
            students=temp;
        }
        students[size++] = student;
        return student;
    }

    public Student get(int index) {
        if (index < 0 || index>=size){
            System.err.println("Index out bound");
            return null;
        }
        return students[index];
    }

    public int size(){
        return size;
    }
}
