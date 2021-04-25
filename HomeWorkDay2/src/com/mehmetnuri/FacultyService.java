package com.mehmetnuri;

public class FacultyService {

    public void addFaculty(Faculty faculty) {
        System.out.println(faculty.name + " faculty is added");
    }

    public void deleteFaculty(Faculty faculty) {
        System.out.println(faculty.name + " faculty is deleted");
    }

    public void updateFaculty(Faculty faculty) {
        System.out.printf(faculty.name + " faculty is updated");
    }
}
