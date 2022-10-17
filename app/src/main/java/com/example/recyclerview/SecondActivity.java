package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView rvSupermarket;
    private ArrayList<String> productsList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rvSupermarket = findViewById(R.id.rv_supermarket);
        productsList.add("Fruits");
        productsList.add("Vegetables");
        productsList.add("Meal");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        productsList.add("Cakes");
        ProductsAdapter adapter = new ProductsAdapter(productsList);
        rvSupermarket.setAdapter(adapter);
    }
}