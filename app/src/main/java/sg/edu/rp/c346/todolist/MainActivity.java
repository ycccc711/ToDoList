package sg.edu.rp.c346.todolist;

import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvtodo;
    ArrayList<Todo> alTodo;
    ArrayAdapter<Todo> aaTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list view
        lvtodo = findViewById(R.id.lvToDo);

        //arraylist
        alTodo = new ArrayList<>();
        Todo a = new Todo("MSA","1/7/2019");
        Todo b = new Todo("Go for haircut","22/9/2019");

        alTodo.add(a);
        alTodo.add(b);

        //arrayadapter
        TodoAdapter adapter = new TodoAdapter(MainActivity.this,R.layout.row,alTodo);
        lvtodo.setAdapter(adapter);

    }
}
