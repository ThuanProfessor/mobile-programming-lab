package com.nht.thuanproject;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainImages extends AppCompatActivity {
    List<String> list;
    int[] images = {
            R.drawable.apple,
            R.drawable.book,
            R.drawable.find,
            R.drawable.fitness,
            R.drawable.home,
            R.drawable.pay

    };

    String[] apple = {
            "Logo",
            "Book",
            "Find",
            "Fitness",
            "Home",
            "Pay"
    };

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_images);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView = findViewById(R.id.gridViewNew);

        MyImageAdapter

    }
}