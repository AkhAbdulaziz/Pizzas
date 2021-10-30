package uz.gita.Pizzas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View californiaPizza;
    private View calzonePizza;
    private View chicagoPizza;
    private View detroitPizza;
    private View greekPizza;
    private View louisPizza;
    private View neapolitanPizza;
    private View newYorkPizza;
    private View romanPizza;
    private View sicilianPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.applicationInfoButton).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AppInfoActivity.class);
            startActivity(intent);
        });

        californiaPizza = findViewById(R.id.californiapizza);
        californiaPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Californian Pizza");
            intent.putExtra("info1", R.string.california_pizza_text1);
            intent.putExtra("info2", R.string.california_pizza_text2);
            intent.putExtra("photo1", R.drawable.california_style_pizza1);
            intent.putExtra("photo2", R.drawable.california_style_pizza2);
            intent.putExtra("photo3", R.drawable.california_style_pizza3);
            startActivity(intent);
        });

        calzonePizza = findViewById(R.id.calzonepizza);
        calzonePizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Calzone Pizza");
            intent.putExtra("info1", R.string.calzone_pizza_text1);
            intent.putExtra("info2", R.string.calzone_pizza_text2);
            intent.putExtra("photo1", R.drawable.calzone_pizza1);
            intent.putExtra("photo2", R.drawable.calzone_pizza2);
            intent.putExtra("photo3", R.drawable.calzone_pizza3);
            startActivity(intent);
        });

        chicagoPizza = findViewById(R.id.chicagopizza);
        chicagoPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Chicago Pizza");
            intent.putExtra("info1", R.string.chicago_pizza_text1);
            intent.putExtra("info2", R.string.chicago_pizza_text2);
            intent.putExtra("photo1", R.drawable.chicago_pizza1);
            intent.putExtra("photo2", R.drawable.chicago_pizza2);
            intent.putExtra("photo3", R.drawable.chicago_pizza3);
            startActivity(intent);
        });

        detroitPizza = findViewById(R.id.detroitpizza);
        detroitPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Detroit Pizza");
            intent.putExtra("info1", R.string.detroit_pizza_text1);
            intent.putExtra("info2", R.string.detroit_pizza_text2);
            intent.putExtra("photo1", R.drawable.detroit_style_pizza1);
            intent.putExtra("photo2", R.drawable.detroit_style_pizza2);
            intent.putExtra("photo3", R.drawable.detroit_style_pizza3);
            startActivity(intent);
        });

        greekPizza = findViewById(R.id.greekpizza);
        greekPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Greek Pizza");
            intent.putExtra("info1", R.string.greek_pizza_text1);
            intent.putExtra("info2", R.string.greek_pizza_text2);
            intent.putExtra("photo1", R.drawable.greek_pizza1);
            intent.putExtra("photo2", R.drawable.greek_pizza2);
            intent.putExtra("photo3", R.drawable.greek_pizza3);
            startActivity(intent);
        });

        louisPizza = findViewById(R.id.louispizza);
        louisPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "St. Louis Pizza");
            intent.putExtra("info1", R.string.louis_pizza_text1);
            intent.putExtra("info2", R.string.louis_pizza_text2);
            intent.putExtra("photo1", R.drawable.louis_pizza1);
            intent.putExtra("photo2", R.drawable.louis_pizza2);
            intent.putExtra("photo3", R.drawable.louis_pizza3);
            startActivity(intent);
        });

        neapolitanPizza = findViewById(R.id.neapolitanpizza);
        neapolitanPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Neapolitan Pizza");
            intent.putExtra("info1", R.string.neapolitan_pizza_text1);
            intent.putExtra("info2", R.string.neapolitan_pizza_text2);
            intent.putExtra("photo1", R.drawable.neapolitan_pizza1);
            intent.putExtra("photo2", R.drawable.neapolitan_pizza2);
            intent.putExtra("photo3", R.drawable.neapolitan_pizza3);
            startActivity(intent);
        });

        newYorkPizza = findViewById(R.id.newyorkpizza);
        newYorkPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "New York Pizza");
            intent.putExtra("info1", R.string.new_york_pizza_text1);
            intent.putExtra("info2", R.string.new_york_pizza_text2);
            intent.putExtra("photo1", R.drawable.new_york_pizza1);
            intent.putExtra("photo2", R.drawable.new_york_pizza2);
            intent.putExtra("photo3", R.drawable.new_york_pizza3);
            startActivity(intent);
        });

        romanPizza = findViewById(R.id.romanpizza);
        romanPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Roman Pizza");
            intent.putExtra("info1", R.string.roman_pizza_text1);
            intent.putExtra("info2", R.string.roman_pizza_text2);
            intent.putExtra("photo1", R.drawable.roman_pizza1);
            intent.putExtra("photo2", R.drawable.roman_pizza2);
            intent.putExtra("photo3", R.drawable.roman_pizza3);
            startActivity(intent);
        });

        sicilianPizza = findViewById(R.id.sicilianpizza);
        sicilianPizza.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("menuName", "Sicilian Pizza");
            intent.putExtra("info1", R.string.sicilian_pizza_text1);
            intent.putExtra("info2", R.string.sicilian_pizza_text2);
            intent.putExtra("photo1", R.drawable.sicilian_pizza1);
            intent.putExtra("photo2", R.drawable.sicilian_pizza2);
            intent.putExtra("photo3", R.drawable.sicilian_pizza3);
            startActivity(intent);
        });
    }
}