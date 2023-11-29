package com.example.todolist2;

import static com.example.todolist2.TaskList.tasks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AddTask extends AppCompatActivity {
    EditText task_name;
    EditText task_desc;
    EditText task_debut_date;
    EditText task_deadline;
    RadioGroup task_priority;
    Button btn_add_newtask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);
        task_name = findViewById(R.id.task_name_edit);
        task_desc = findViewById(R.id.task_desc_edit);
        task_debut_date = findViewById(R.id.task_debut_date_edit);
        task_deadline = findViewById(R.id.task_deadline_edit);
        task_priority = findViewById(R.id.task_status);
        btn_add_newtask = findViewById(R.id.btn_send_newtask);

        tasks.add(new Task(task_name.toString(),task_desc.toString(),task_debut_date.toString()
                ,task_deadline.toString(),task_priority.toString()));
        btn_add_newtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_newtask = new Intent(getApplicationContext(),TaskList.class);
                startActivity(intent_newtask);
            }
        });
    }
}
