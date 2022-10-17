package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_cars;
    private ArrayList<String> carsList = new ArrayList<>();
    private Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_cars = findViewById(R.id.recycler_view);
        carsList.add("Sedan");
        carsList.add("Minivan");
        carsList.add("Sports car");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");
        carsList.add("Crossover");

        CarsAdapter adapter = new CarsAdapter(carsList);
        rv_cars.setAdapter(adapter);


    }

    public void onButtonClick(View view) {
        button = findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}