package se.kth.roberto.samplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<TaskItem> tasks;
    private ListView todayTaskListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        tasks = new ArrayList<>();
        tasks.add(new TaskItem("Task 1"));
        tasks.add(new TaskItem("Task 2"));
        tasks.add(new TaskItem("Task 3"));

        // Create the adapter to convert the array to views
        TaskItemAdapter adapter = new TaskItemAdapter(this, tasks);

        todayTaskListView =  (ListView) findViewById(R.id.today_task_list_view);
        // Attach the adapter to a ListView
        todayTaskListView.setAdapter(adapter);

        // Add items to adapter
        adapter.addAll(tasks);
    }
}
