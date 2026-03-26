package com.nht.thuanproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridViewActivity extends AppCompatActivity {

    TextView noiDung;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        noiDung = (TextView) findViewById(R.id.txtMessage);
        gridView = findViewById(R.id.gridV1);

        ArrayAdapter<CharSequence> arrayAdapter  = ArrayAdapter.createFromResource(this, R.array.data, android.R.layout.simple_list_item_1);

        gridView.setAdapter(arrayAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Cách lấy dữ liệu an toàn nhất: lấy từ Adapter
                String itemValue = parent.getItemAtPosition(position).toString();

                // Hiển thị kết quả
                noiDung.setText(position + " : " + itemValue);
            }
        });

    }


}