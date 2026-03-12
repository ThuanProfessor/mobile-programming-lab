package com.nht.thuanproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnHello;
    Button btnChao;
    Button btnXoa;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editText = findViewById(R.id.editText);
        btnHello = findViewById(R.id.btnHello);
        btnChao = findViewById(R.id.btnChao);
        btnXoa = findViewById(R.id.btnXoa);
        tvResult = findViewById(R.id.tvResult);


        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                StringBuilder builder = new StringBuilder();

                builder.append("Hello ");
                builder.append(name);


                tvResult.setText(builder.toString());
            }
        });

        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                StringBuilder builder = new StringBuilder();

                builder.append("Chào ");
                builder.append(name);

                tvResult.setText(builder.toString());
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               editText.setText("");
               tvResult.setText("");
            }
        });

    }


}