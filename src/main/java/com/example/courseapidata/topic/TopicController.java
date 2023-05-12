package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    @CrossOrigin
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{name}")
    public Topic getTopic(@PathVariable String name){
        return topicService.getTopic(name);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    @CrossOrigin
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{name}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String name){
        topicService.updateTopic(topic, name);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
    public void deleteTopic(@PathVariable String name){
        topicService.deleteTopic(name);
    }
}
