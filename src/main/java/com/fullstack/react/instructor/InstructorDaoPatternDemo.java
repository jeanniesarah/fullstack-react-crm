package com.fullstack.react.instructor;

public class InstructorDaoPatternDemo {
    public static void main(String[] args) {
        InstructorDao instructorDao = new InstructorDaoImplementation();

        //print all instructors
        for (Instructor instructor : instructorDao.getAllInstructors()) {
            System.out.println("Instructor Name: " + instructor.getName() + " UUID: " + instructor.getUuid());
        }

        //update instructor
        Instructor instructor = instructorDao.getAllInstructors().get(0);
        instructor.setName("Michael");
        instructorDao.updateInstructor(instructor);

        //get instructor
        instructorDao.getInstructor(0);
        System.out.println("Instructor Name: " + instructor.getName() + " UUID: " + instructor.getUuid());
    }
}