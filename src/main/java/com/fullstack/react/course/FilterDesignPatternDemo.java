package com.fullstack.react.course;

import java.util.ArrayList;
import java.util.List;

public class FilterDesignPatternDemo {
    public static void main(String[] args) {
        List < Course > courseList = new ArrayList < > ();

        courseList.add(new Course("Computer Architecture 101", "CS"));
        courseList.add(new Course("HTML, CSS, JavaScript 102", "CS"));
        courseList.add(new Course("Web Frameworks 102", "CS"));
        courseList.add(new Course("Calculus and Vectors", "M"));
        courseList.add(new Course("Physics", "P"));

        Criteria csCourses = new CriteriaCS();

        System.out.println("Computer Science Courses: ");
        printCourseInfo(csCourses.criteria(courseList));
    }

    public static void printCourseInfo(List < Course > courseList) {
        for (Course course: courseList) {
            System.out.println("| Name: " +
                    course.getName() + ", Course code: " +
                    course.getCourseCode() + " |");
        }
    }
}