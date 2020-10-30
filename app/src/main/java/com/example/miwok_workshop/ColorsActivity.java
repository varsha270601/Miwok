package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    private Object miwokAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final List<MiwokModel> colors = new ArrayList<>();
        String mMiwoktranslation, mDefaulttranslation;
        colors.add(new MiwokModel(mMiwoktranslation:"red", mDefaulttranslation:"weṭeṭṭi", R.drawable.color_red));

        colors.add(new MiwokModel("green", "chokokki", R.drawable.color_green));
        colors.add(new MiwokModel("brown", "ṭakaakki", R.drawable.color_brown));
        colors.add(new MiwokModel("gray", "ṭopoppi", R.drawable.color_gray));
        colors.add(new MiwokModel("black", "kululli", R.drawable.color_black));
        colors.add(new MiwokModel("white", "kelelli", R.drawable.color_white));
        colors.add(new MiwokModel("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colors.add(new MiwokModel("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        RecyclerView colors_recyclerView = findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        colors_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter mMiwokAdapter= new MiwokAdapter(this,colors,R.color.category_colors);
        colors_recyclerView.setAdapter((RecyclerView.Adapter)miwokAdapter);
    }
}


