package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityMain extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        List<Films> films = new ArrayList<>();
        String[] names = getResources().getStringArray(R.array.names);
        String[] years = getResources().getStringArray(R.array.years);
        int[] img = {R.drawable.enemies, R.drawable.panda, R.drawable.notebook, R.drawable.prideandprejudice,
                R.drawable.thebestofme, R.drawable.justgowithit, R.drawable.longestyard, R.drawable.theboymolefoxhorse,
                R.drawable.grownups, R.drawable.click};


        recyclerView = findViewById(R.id.recyclerView);

        for(int i=0; i<names.length; i++){
            films.add(new Films(names[i], years[i], img[i]));
        }
        int i=0;
        films.add(new Films(names[i], years[i], R.drawable.enemies));
        films.add(new Films(names[i], years[i], R.drawable.panda));
        films.add(new Films(names[i], years[i], R.drawable.notebook));
        films.add(new Films(names[i], years[i], R.drawable.prideandprejudice));
        films.add(new Films(names[i], years[i], R.drawable.thebestofme));
        films.add(new Films(names[i], years[i], R.drawable.justgowithit));
        films.add(new Films(names[i], years[i], R.drawable.longestyard));
        films.add(new Films(names[i], years[i], R.drawable.theboymolefoxhorse));
        films.add(new Films(names[i], years[i], R.drawable.grownups));
        films.add(new Films(names[i], years[i], R.drawable.click));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(getApplicationContext(),films);
        recyclerView.setAdapter(adapter);


    }
}
