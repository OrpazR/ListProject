package com.example.listorpaz;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private Spinner spinner;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        spinner=findViewById(R.id.spinner);
        listView=findViewById(R.id.listView);
        List<Movie> itemsList = new ArrayList<>();
        itemsList.add(new Movie("The Dark Knight","2008"));
        itemsList.add(new Movie("The Godfather Part II","1974"));
        itemsList.add(new Movie("Maharaja","2024"));
        itemsList.add(new Movie("12th Fail","2023"));
        itemsList.add(new Movie(" Oppenheimer","2023"));


        SpinerListAdapter adapter = new SpinerListAdapter(itemsList);
        recyclerView.setAdapter(adapter);


        String[] countries = {"India", "USA", "UK", "Australia"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countries);
        spinner.setAdapter(adapter1);
        listView.setAdapter(adapter1);
    }
}
