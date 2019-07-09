package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter {
    Context mcontext;
    int layout_id;
    ArrayList<Todo> alTodo;

    public TodoAdapter(Context context,int resource,ArrayList<Todo>object){
        super(context,resource,object);

        mcontext = context;
        layout_id = resource;
        alTodo = object;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTodo = rowView.findViewById(R.id.textViewTodo);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        Todo currentVersion = alTodo.get(position);

        // Set values to the TextView to display the corresponding information
        tvTodo.setText(currentVersion.getTodo());
        tvDate.setText(currentVersion.getDate());

        return rowView;
    }

}
