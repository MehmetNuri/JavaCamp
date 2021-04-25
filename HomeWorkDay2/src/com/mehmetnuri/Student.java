package com.mehmetnuri;

public class Student {

    public Student() {
    }

    public Student(int id, String firstName, String lastName, int faculty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    int id;
    String firstName;
    String lastName;
    int faculty;
}
