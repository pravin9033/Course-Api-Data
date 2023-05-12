package main.Course;

import main.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicname}/courses")
    @CrossOrigin
    public List<Course> getAllCourses(@PathVariable String name){
        return courseService.getAllCourses(name);
    }
    @RequestMapping("/topics/{topicName}/courses/{name}")
    public Course getCourse(@PathVariable String name){
        return courseService.getCourse(name);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicName}/courses")
    @CrossOrigin
    public void addCourse(@RequestBody Course course, @PathVariable String topicName){
        course.setTopic(new Topic(topicName,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicName}/courses/{name}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicName){
        course.setTopic(new Topic(topicName,"",""));
        courseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicName}/courses/{name}")
    public void deleteCourse(@PathVariable String name){
        courseService.deleteCourse(name);
    }
}
