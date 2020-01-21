package com.fullstack.react.course;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCS implements Criteria {
    @Override
    public List < Course > criteria(List < Course > courseList) {
        List < Course > csCourses = new ArrayList < > ();

        for (Course course: courseList) {
            if (course.getCourseCode().equalsIgnoreCase("CS")) {
                csCourses.add(course);
            }
        }
        return csCourses;
    }
}