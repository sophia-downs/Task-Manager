package com;

import javax.swing.*;
import java.awt.GridLayout;
import static javafx.application.Application.launch;

public class TaskManagerUI {
    private TaskManager taskManager;
    private JFrame frame;
    private JTextField taskNameField;
    private JComboBox<Priority> priorityComboBox;
    private JTextArea descriptionArea;
    private JLabel taskLabel;
    private JButton addButton;
    private JButton removeButton;
    private JButton editButton;

    public TaskManagerUI() {
        taskManager = new TaskManager();
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Task Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(4, 2));

        taskNameField = new JTextField();
        priorityComboBox = new JComboBox<>(Priority.values());
        descriptionArea = new JTextArea();
        taskLabel = new JLabel();
        addButton = new JButton("Add");
        addButton.addActionListener(e -> addTask());
        removeButton = new JButton("Remove");
        removeButton.addActionListener(e -> removeTask());
        editButton = new JButton("Edit");
        editButton.addActionListener(e -> editTask());

        frame.add(new JLabel("Task Name:"));
        frame.add(taskNameField);
        frame.add(new JLabel("Priority.java:"));
        frame.add(priorityComboBox);
        frame.add(new JLabel("Description:"));
        frame.add(descriptionArea);
        frame.add(taskLabel);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(editButton);

        frame.setVisible(true);
    }

    private void addTask() {
        String name = taskNameField.getText();
        Priority priority = (Priority) priorityComboBox.getSelectedItem();
        String description = descriptionArea.getText();
        Task task = new Task(name, description);
        taskManager.addTask(task);
        updateLabel();
    }

    private void removeTask() {
        String name = taskNameField.getText();
        Priority priority = (Priority) priorityComboBox.getSelectedItem();
        String description = descriptionArea.getText();
        Task task = new Task(name, description);
        taskManager.removeTask(task);
        updateLabel();
    }


    private void updateLabel() {
        StringBuilder sb = new StringBuilder();
        for(com.Task task : taskManager.getTasksByStatus(Status.NOT_STARTED)) {
            sb.append(String.format("Task: %s, Priority.java: %s, Description: %s%n",
                    task.getName(), task.getPriority().toString(), task.getDescription()));
        }
        taskLabel.setText(sb.toString());
    }

    public static void main(String[] args) {
        launch(args);
    }


}







