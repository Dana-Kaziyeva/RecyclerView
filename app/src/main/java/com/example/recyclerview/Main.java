package com.example.recyclerview;

import static androidx.core.graphics.drawable.IconCompat.getResources;

import android.os.Bundle;

import java.util.ArrayList;

public class Main {
    ArrayList<Films> filmsModels = new ArrayList<>();
    int[] img = {R.drawable.enemies, R.drawable.panda, R.drawable.notebook, R.drawable.prideandprejudice,
    R.drawable.thebestofme, R.drawable.justgowithit, R.drawable.longestyard, R.drawable.theboymolefoxhorse,
    R.drawable.grownups, R.drawable.click};
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        setUpModels();
    }
    private void setUpModels(){
        String[] names = getResources().getStringArray(R.array.names);
        String[] years = getResources().getStringArray(R.array.years);
        for(int i=0; i<names.length; i++){
            filmsModels.add(new Films(names[i], years[i], img[i]));
        }

    }

}
