package com.example.courseapidata.course;


import com.example.courseapidata.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private String name;
    private String details;
    private String description;
    @ManyToOne
    private Topic topic;
    public Course(){

    }
    public Course(String name, String details, String description, String topicName){
        super();
        this.name = name;
        this.details = details;
        this. description = description;
        this.topic = new Topic(topicName,"","");
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
