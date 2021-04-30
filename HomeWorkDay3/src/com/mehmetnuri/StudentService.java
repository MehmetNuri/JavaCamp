package com.mehmetnuri;

public class StudentService  extends UserService{

    @Override
    public void add(User user) {
        System.out.println("Student : "+ user.getFirstName() +" is added");

    }

    @Override
    public void delete(User user) {
        System.out.println("Student : "+ user.getFirstName() +"  is deleted.");
    }

    @Override
    public void update(User user) {
        System.out.println("Student : "+ user.getFirstName() +" is Updated.");

    }
    public void getAll(Student[] students){
        for (Student student:students){
            System.out.println(student.getFirstName());
        }

    }
}
