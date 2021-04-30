package com.mehmetnuri;

public class InstructorService  extends UserService{
    @Override
    public void add(User user) {
        System.out.println("Instructor : "+ user.getFirstName()+" "+ user.getLastName() +" is added." );

    }
    @Override
    public void delete(User user) {
        System.out.println("Instructor : "+ user.getFirstName() +" "+ user.getLastName() + " is deleted.");
    }

    @Override
    public void update(User user) {
        System.out.println("Instructor : "+ user.getFirstName() +" "+ user.getLastName() + " is Updated.");

    }
}
