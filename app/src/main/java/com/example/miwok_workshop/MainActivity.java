package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packageContext:MainActivity.this, NumbersActivity.class)
                ;
                startActivity(intent);
            }
        });
        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packagecontext:MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });
        TextView familymembers = findViewById(R.id.familymembers);
        familymembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packageContext:MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });
        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packageContext:MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }
}




