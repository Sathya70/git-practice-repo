package com.example;

public class App {
    public static void main(String[] args) {
        Task task = new Task(1, "Prepare for git  interview", false);

        System.out.println("Ttask manager");
        System.out.println("-------------");
        System.out.println("id: " + task.getId());
        System.out.println("task: " + task.getTitle());
        System.out.println("Completed: " + task.isCompleted());
    }
}
