package main.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    @Id
    private String name;
    private String details;
    private String description;

    public Topic(){

    }
    public Topic(String name, String details, String description){
        super();
        this.name = name;
        this.details = details;
        this. description = description;
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
}
