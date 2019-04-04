package com.example.myapplication_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication_listview.Adapter.List_Adapter;
import com.example.myapplication_listview.Modal.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ListView lstStudentData;
    private ArrayList<Student> studentArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
initData();


        lstStudentData = findViewById(R.id.studentlist);

        List_Adapter mstudentAdapter = new List_Adapter(this, studentArrayList);
        lstStudentData.setAdapter(mstudentAdapter);


        lstStudentData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student studlist = studentArrayList.get(position);
            }
        });

    }


    private void initData()
    {
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("1", "Pritesh", "India"));
        studentArrayList.add(new Student("2", "Samir", "India"));
        studentArrayList.add(new Student("3", "Mandeep", "Canada"));

}
}