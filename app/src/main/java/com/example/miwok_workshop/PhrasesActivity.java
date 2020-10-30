package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    private Object miwokAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final List<MiwokModel> phrases = new ArrayList<>();


        phrases.add(new MiwokModel("Where are you going?", "minto wuksus"));
        phrases.add(new MiwokModel("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new MiwokModel("My name is...", "oyaaset..."));
        phrases.add(new MiwokModel("How are you feeling?", "michәksәs?"));
        phrases.add(new MiwokModel("I’m feeling good.", "kuchi achit"));
        phrases.add(new MiwokModel("Are you coming?", "әәnәs'aa?"));
        phrases.add(new MiwokModel("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases.add(new MiwokModel("I’m coming.", "әәnәm"));
        phrases.add(new MiwokModel("Let’s go.", "yoowutis"));
        phrases.add(new MiwokModel("Come here.", "әnni'nem"));

        RecyclerView phrases_recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        phrases_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter mMiwokAdapter=new MiwokAdapter(this,phrases,R.color.category_phrases);


        phrases_recyclerView.setAdapter((RecyclerView.Adapter)miwokAdapter);

    }
}