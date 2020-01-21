package com.fullstack.react.instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorDaoImplementation implements InstructorDao {
    List<Instructor> instructors;

    public InstructorDaoImplementation() {
        instructors = new ArrayList<Instructor>();
        Instructor msdInstructor = new Instructor("Julia", 1);
        Instructor csInstructor = new Instructor("Mike", 2);
        instructors.add(msdInstructor);
        instructors.add(csInstructor);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructors;
    }

    @Override
    public Instructor getInstructor(int uuid) {
        return instructors.get(uuid);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        instructors.get(instructor.getUuid()).setName(instructor.getName());
        System.out.println("Instructor Name: " + instructor.getName() + " UUID: " + instructor.getUuid() + " updated in database");
    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        instructors.remove(instructor.getUuid());
        System.out.println("Instructor Name: " + instructor.getName() + " UUID: " + instructor.getUuid() + " deleted from database");
    }
}