package com.example.courseapidata.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,String> {
    List<Course> findByTopicName(String TopicName);

}
