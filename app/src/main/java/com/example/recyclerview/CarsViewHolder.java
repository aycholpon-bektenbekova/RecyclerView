package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCars;
    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);

        tvCars = itemView.findViewById(R.id.tv_cars);
    }

    public void bind(String cars){
        tvCars.setText(cars);
    }
}
