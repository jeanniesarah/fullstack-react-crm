package com.fullstack.react.course;

public class Course {
    private String name;
    private String courseCode;

    public Course(String name, String courseCode) {
        this.name = name;
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getName() {
        return name;
    }
}