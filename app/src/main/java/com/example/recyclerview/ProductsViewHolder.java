package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvSupermarket;

    public ProductsViewHolder(@NonNull View itemView) {
        super(itemView);

        tvSupermarket = itemView.findViewById(R.id.tv_supermarket);
    }
    public void bind(String products){
        tvSupermarket.setText(products);
    }
}
