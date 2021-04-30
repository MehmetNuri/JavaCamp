package com.mehmetnuri;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Mehmet Nuri");
        student.setLastName("Öztürk");
        student.setEmail("info@mehmetnuri.net");
        student.setCoursesApplied("Java & React Camp 2021");

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("engin@udemy.com");
        instructor.setCoursesInstructor("Java & React Yazılımcı Geliştirme Kampı");

        UserService userManager  = new InstructorService();
        UserService userManager2 = new StudentService();
        UserService userManager3 = new UserService();


        User[] users = {student, instructor};
        userManager.add(instructor);
        userManager2.add(student);
        userManager3.addMultiple(users);
        userManager.update(instructor);
        userManager.delete(instructor);
        userManager2.update(student);
        userManager2.delete(student);

    }
}
