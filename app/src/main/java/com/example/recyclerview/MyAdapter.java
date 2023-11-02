package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    Context context;
    List<Films> films;

    public MyAdapter(Context context, List<Films> films) {
        this.context = context;
        this.films = films;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyViewHolder view = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.film_view, parent,false));
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(films.get(position).getName());
        holder.yearView.setText(films.get(position).getYear());
        holder.imgView.setImageResource(films.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
