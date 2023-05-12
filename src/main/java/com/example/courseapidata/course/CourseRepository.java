package main.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface CourseRepository extends CrudRepository<Course,String> {
    public List<Course> findByTopicname(String TopicName);

}
