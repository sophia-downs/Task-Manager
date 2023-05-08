package com;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TaskManager {
    private ObservableList<Task> taskList;
    private Scanner scanner;

    public TaskManager() {
        taskList = new ObservableList<Task>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }


    //creates array by priority for display later
    public List<Task> getTasksByPriority(Priority priority) {
        List<Task> tasksByPriority = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getPriority() == priority) {
                tasksByPriority.add(task);
            }
        }
        return tasksByPriority;
    }

    ////creates array by status for display later
    public List<Task> getTasksByStatus(Status status) {
        List<Task> tasksByStatus = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus() == status) {
                tasksByStatus.add(task);
            }
        }
        return tasksByStatus;
    }


}
