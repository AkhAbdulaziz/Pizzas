package uz.gita.Pizzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private String menuName;
    private int info1;
    private int info2;
    private int photo1;
    private int photo2;
    private int photo3;
    private TextView nameOfMenu;
    private TextView infoPizza1;
    private TextView infoPizza2;
    private ImageView photoPizza1;
    private ImageView photoPizza2;
    private ImageView photoPizza3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findViewById(R.id.go_back).setOnClickListener(v -> {
            finish();
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            menuName = bundle.getString("menuName", "");

            info1 = bundle.getInt("info1", 0);
            info2 = bundle.getInt("info2", 0);
            photo1 = bundle.getInt("photo1", 0);
            photo2 = bundle.getInt("photo2", 0);
            photo3 = bundle.getInt("photo3", 0);


            nameOfMenu = findViewById(R.id.nameOfMenu);
            nameOfMenu.setText(menuName);

            infoPizza1 = findViewById(R.id.infoPizza1);
            infoPizza1.setText(info1);
            infoPizza2 = findViewById(R.id.infoPizza2);
            infoPizza2.setText(info2);

            photoPizza1 = findViewById(R.id.photoPizza1);
            photoPizza1.setImageResource(photo1);
            photoPizza2 = findViewById(R.id.photoPizza2);
            photoPizza2.setImageResource(photo2);
            photoPizza3 = findViewById(R.id.photoPizza3);
            photoPizza3.setImageResource(photo3);
        }
    }
}