package com.mehmetnuri;

public class Main {

    public static void main(String[] args) {

        Faculty faculty1 = new Faculty(1, "Engineering", "Engineering faculty");

        Faculty faculty2 = new Faculty();
        faculty2.id = 2;
        faculty2.name = "Science";
        faculty2.description = "Science faculty";

        FacultyService facultyService = new FacultyService();

        facultyService.addFaculty(faculty1);
        facultyService.addFaculty(faculty2);

        facultyService.deleteFaculty(faculty1);
        facultyService.deleteFaculty(faculty2);

        facultyService.updateFaculty(faculty1);
        facultyService.updateFaculty(faculty2);


        Student student1 = new Student(1,"Mehmet Nuri", "Öztürk",1);

        Student student2 = new Student();
        student2.id = 2;
        student2.firstName = "Ögeday";
        student2.lastName = "Öztekin";
        student2.faculty = 2;

        StudentService studentService = new StudentService();

        studentService.addStudent(student1);
        studentService.addStudent(student2);

        studentService.deleteStudent(student1);
        studentService.deleteStudent(student2);

        studentService.updateStudent(student1);
        studentService.updateStudent(student2);


    }
}
