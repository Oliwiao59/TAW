package com.example.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
@Scope("singleton")

public class CourseDatabase {

    private List<Course> courseList = new ArrayList<>();
    private int CourseIndex = 1;

    public void addCourse(Course element){
        element.setId(CourseIndex);
        courseList.add(element);
        CourseIndex = CourseIndex + 1;
    }

    public List<Course> getAllCourses() {
        return courseList;
    }

    public List<Course> getAllCourses(Integer room, String name, Integer points, Boolean exam){
        if (room == null && name == null && points ==null && exam == null){
            return courseList;
        }
        List<Course> filteredCourses = new ArrayList<>();
        for (Course course : courseList) {
            if (room ==null && name == null && points ==null && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (exam ==null && name == null && points ==null && course.getRoom().equals(room)) {
                filteredCourses.add(course);
            }
            if (room ==null && exam == null && points ==null && course.getName().equals(name)) {
                filteredCourses.add(course);
            }
            if (exam ==null && name == null && room ==null && course.getPoints().equals(points)) {
                System.out.println("WTF");
                filteredCourses.add(course);
            }
            if (exam ==null && points ==null && course.getName().equals(name) && course.getRoom().equals(room)) {
                filteredCourses.add(course);
            }
            if (name == null && points ==null && course.getRoom().equals(room) && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (exam == null && name == null && course.getPoints().equals(points) && course.getRoom().equals(room)) {
                filteredCourses.add(course);
            }
            if (room == null && name == null && course.getPoints().equals(points) && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (room == null && points == null && course.getName().equals(name) && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (room == null && exam == null && course.getName().equals(name) && course.getPoints().equals(points)) {
                filteredCourses.add(course);
            }
            if (room == null && course.getExam().equals(exam) && course.getName().equals(name) && course.getPoints().equals(points)) {
                filteredCourses.add(course);
            }
            if (exam == null && course.getRoom().equals(room) && course.getName().equals(name) && course.getPoints().equals(points)) {
                filteredCourses.add(course);
            }
            if (points == null && course.getRoom().equals(room) && course.getName().equals(name) && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (name == null && course.getRoom().equals(room) && course.getPoints().equals(points) && course.getExam().equals(exam)) {
                filteredCourses.add(course);
            }
            if (course.getName().equals((name)) && course.getRoom().equals(room) && course.getPoints().equals(points) && course.getExam().equals(exam)){
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    }


    public void deleteAll(){
        courseList.clear();
    }

    public void delCourseById(Integer id){
        courseList.removeIf(element -> element.getId().equals(id));
    }

    public Course getCourseById(Integer id) {
        for(Course element : courseList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }
}
