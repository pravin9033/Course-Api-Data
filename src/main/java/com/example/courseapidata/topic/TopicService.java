package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String name){
        return topicRepository.findById(name).orElse(null);
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    public void updateTopic(Topic topic, String name) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String name) {
        topicRepository.deleteById(name);
    }
}
