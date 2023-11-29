package com.example.todolist2;

public class Task {
    String task_name,task_desc,task_debut_date,task_deadline,task_priority;
    public Task(String task_name,String task_desc,String task_debut_date,String task_deadline,String task_priority){
        this.task_name=task_name;
        this.task_desc=task_desc;
        this.task_debut_date=task_debut_date;
        this.task_deadline=task_deadline;
        this.task_priority=task_priority;
    }

    public String getTask_deadline() {
        return task_deadline;
    }

    public String getTask_debut_date() {
        return task_debut_date;
    }

    public String getTask_desc() {
        return task_desc;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getTask_priority() {
        return task_priority;
    }
}
