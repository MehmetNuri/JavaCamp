package com.mehmetnuri;

public class UserService {

    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() +" is added.");
    }
    public void addMultiple(User[] user) {
        for (User users : user) {
            add(users);
        }
    }
    public void delete(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() +" is deleted.");
    }
    public void update(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName() +" is updated.");
    }
}
