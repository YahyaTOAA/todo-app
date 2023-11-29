package com.example.todolist2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder>{
    private List<Task> taskList;
    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }
    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView custom_task_name, custom_task_description,custom_task_date_debut,custom_task_deadline,custom_task_priority,custom_task_checkbox;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            custom_task_name = itemView.findViewById(R.id.custom_task_name);
            custom_task_description = itemView.findViewById(R.id.custom_task_description);
            custom_task_date_debut = itemView.findViewById(R.id.custom_task_date_debut);
            custom_task_deadline = itemView.findViewById(R.id.custom_task_deadline);
            custom_task_priority = itemView.findViewById(R.id.custom_task_priority);
            custom_task_checkbox = itemView.findViewById(R.id.custom_task_checkbox);
        }
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.custom_task_name.setText(task.getTask_name());
        holder.custom_task_description.setText(task.getTask_desc());
        holder.custom_task_date_debut.setText(task.getTask_debut_date());
        holder.custom_task_deadline.setText(task.getTask_deadline());
        holder.custom_task_priority.setText(task.getTask_priority());
    }


    @Override
    public int getItemCount() {
        return taskList.size();
    }
}
