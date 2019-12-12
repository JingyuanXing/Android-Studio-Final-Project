package com.example.app3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    String[] dishes = new String[] {
            "Chicken Wings",
            "Fries",
            "Smashed Potato",
            "Salad",
            "Sweet Corns",
            "Brocolli",
            "Baked Beans",
            "Cabbage",
            "Breads",
            "Sweet Potato"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lvDishes = (ListView)findViewById(R.id.lvDishes);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, dishes);
        lvDishes.setAdapter(adapter);

        lvDishes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You ordered: " + dishes[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
