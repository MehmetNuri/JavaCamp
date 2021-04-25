package com.mehmetnuri;

public class StudentService {

    public void addStudent(Student student) {
        System.out.println(student.firstName+ " "+ student.lastName + " is added");
    }

    public void deleteStudent(Student student) {
        System.out.println(student.firstName+ " "+ student.lastName + " is deleted");
    }

    public void updateStudent(Student student) {
        System.out.println(student.firstName+ " "+ student.lastName + " is added");
    }
}
