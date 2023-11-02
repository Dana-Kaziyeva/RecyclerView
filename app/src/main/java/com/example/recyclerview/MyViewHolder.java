package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView nameView, yearView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imgView = itemView.findViewById(R.id.imageView);
        nameView = itemView.findViewById(R.id.textView);
        yearView = itemView.findViewById(R.id.textView2);
    }
}
