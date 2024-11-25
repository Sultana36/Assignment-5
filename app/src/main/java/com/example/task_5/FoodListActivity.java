package com.example.task_5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FoodListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        recyclerView = findViewById(R.id.recyclerView);


        String[] foodItems = getResources().getStringArray(R.array.food_items);

        Integer[] imgId = {
                R.drawable.burger,
                R.drawable.pizza,
                R.drawable.sushi,
                R.drawable.pasta,
                R.drawable.steak,
                R.drawable.salad,
                R.drawable.dessert,
                R.drawable.tacos,
                R.drawable.ramen,
                R.drawable.fried_chicken
        };

        FoodAdapter adapter = new FoodAdapter(this, foodItems, imgId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
