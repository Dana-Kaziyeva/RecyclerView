package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.MyViewHolder> {

    Context context;
    ArrayList<Films> filmsModels;

    public RV_Adapter(Context context, ArrayList<Films> filmsModels){
        this.context = context;
        this.filmsModels = filmsModels;
    }
    @NonNull
    @Override
    public RV_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new RV_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RV_Adapter.MyViewHolder holder, int position) {

        holder.name.setText(filmsModels.get(position).getName());
        holder.year.setText(filmsModels.get(position).getYear());
        holder.imgView.setImageResource(filmsModels.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return filmsModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgView;
       TextView name, year;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            year = itemView.findViewById(R.id.textView2);

        }
    }
}
