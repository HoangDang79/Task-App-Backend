package com.example.Task_App_Backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping(path = "/tasks")
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Milestone 1", "Spring App pushen", true, "18.10.2026"));
        tasks.add(new Task("Retoure", "Kleidung zurückgeben", false, "20.10.2026"));
        tasks.add(new Task("Friseurtermin", "Haare schneiden", false, "22.10.2026"));
        tasks.add(new Task("Milestone 2", "Vue.js App erstellen", false, "08.11.2026"));

        return ResponseEntity.ok(tasks);
    }
}