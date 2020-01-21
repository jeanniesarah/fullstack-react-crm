package com.fullstack.react.instructor;

import java.util.List;

public interface InstructorDao {
    public List< Instructor > getAllInstructors();
    public Instructor getInstructor(int uuid);
    public void updateInstructor(Instructor instructor);
    public void deleteInstructor(Instructor instructor);
}