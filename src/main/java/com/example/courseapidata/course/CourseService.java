package com.example.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses(String topicName){
        return new ArrayList<>(courseRepository.findByTopicName(topicName));
    }
    public Course getCourse(String name){
        return courseRepository.findById(name).orElse(null);
    }
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String name) {
        courseRepository.deleteById(name);
    }
}
