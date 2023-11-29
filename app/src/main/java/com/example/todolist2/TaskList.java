package com.example.todolist2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


public class TaskList extends AppCompatActivity {
    RecyclerView task_list_recyclerview;
    TaskAdapter taskAdapter;
    public static ArrayList<Task> tasks = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_list);
        task_list_recyclerview =findViewById(R.id.task_list_recyclerview);
        task_list_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        taskAdapter = new TaskAdapter(tasks);
        task_list_recyclerview.setAdapter(taskAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menuAdd) {
            Toast.makeText(this, "Option Ajouter sélectionnée", Toast.LENGTH_SHORT).show();
            Intent intent_add = new Intent(getApplicationContext(),AddTask.class);
            startActivity(intent_add);
            return true;
//        } else if (itemId == R.id.menuUpdate) {
//            Intent intent_update = new Intent(getApplicationContext(),AddTask.class);
//            startActivity(intent_update);
//            Toast.makeText(this, "Option Modifier sélectionnée", Toast.LENGTH_SHORT).show();
//            return true;
        } else if (itemId == R.id.menuDelete) {
            Toast.makeText(this, "Option Supprimer sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menuDisconnect) {
            Intent intent_deconnecter = new Intent(getApplicationContext(),Login.class);
            startActivity(intent_deconnecter);
            Toast.makeText(this, "Option Deconnecter sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
