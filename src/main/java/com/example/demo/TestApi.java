package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")


public class TestApi {

    @Autowired
    private CourseDatabase courseDatabase;

    @GetMapping("v1")
    public String test() {
        return "test";
    }

    @PostMapping(value = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addCourse(@RequestBody Course course) {
        courseDatabase.addCourse(course);

    }

    @GetMapping(value = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getCourses(
            @Nullable @RequestParam("points") Integer points,
            @Nullable @RequestParam("room") Integer room,
            @Nullable @RequestParam("exam") Boolean exam,
            @Nullable @RequestParam("name") String name) {
        return courseDatabase.getAllCourses(room, name, points, exam);

    }

    @DeleteMapping(value = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCourses() {
        courseDatabase.deleteAll();}

    //new
    @GetMapping(value = "courses/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCourseById(@PathVariable("id") Integer id){
        Course course = courseDatabase.getCourseById(id);
        if (course == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(course);
    }
    @DeleteMapping(value = "courses/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delCourseById(@PathVariable("id") Integer id){
        Course course = courseDatabase.getCourseById(id);
        if (course == null){
            return ResponseEntity.notFound().build();
        }
        courseDatabase.delCourseById(id);
        return ResponseEntity.ok(course);
    }
}

