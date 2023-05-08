package com;

import java.time.LocalDate;

public class HomeworkTask extends Task {
    private LocalDate dueDate;
    private String subject;
    private boolean completed;

    public HomeworkTask(String name, String description, Priority priority, Status status, String Assignee, LocalDate dueDate, String subject, boolean completed) {
        super(name, description);
        this.dueDate = dueDate;
        this.subject = subject;
        this.completed = completed;
    }

    //getters setters
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
