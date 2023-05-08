package com;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Task {

    private ListView<Task> taskList;
    private String name;
    private String description;
    private Priority priority;
    private Status status;
    private String assignee;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;

    }



    //getter setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

