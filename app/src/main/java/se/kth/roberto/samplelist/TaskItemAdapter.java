package se.kth.roberto.samplelist;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by guancio on 13/12/2017.
 */
    public class TaskItemAdapter extends ArrayAdapter<TaskItem> {
        public TaskItemAdapter(Context context, ArrayList<TaskItem> tasks) {
            super(context, R.layout.task_item, tasks);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            TaskItem task = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.task_item, parent, false);
            }

            // Lookup view for data population
            TextView taskName = (TextView) convertView.findViewById(R.id.task_name);

            // Populate the data into the template view using the data object
            taskName.setText(task.name);

            // Return the completed view to render on screen
            return convertView;
        }
    }