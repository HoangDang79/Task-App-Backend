package com.example.Task_App_Backend;

public class Task {
    private String title;
    private String description;
    private boolean isDone;
    private String deadline; // Jetzt einfach als Text (String)

    // Konstruktor
    public Task(String title, String description, boolean isDone, String deadline) {
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.deadline = deadline;
    }

    // Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}