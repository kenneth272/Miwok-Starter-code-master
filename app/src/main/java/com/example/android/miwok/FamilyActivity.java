package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        ArrayList<Word> family = new ArrayList<>();

        family.add(new Word("father", "әpә", R.drawable.family_father));
        family.add(new Word("mother", "әṭa", R.drawable.family_mother));
        family.add(new Word("son", "angsi", R.drawable.family_son));
        family.add(new Word("daughter", "tune", R.drawable.family_daughter));
        family.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        family.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        family.add(new Word("older sister", "tete", R.drawable.family_older_sister));
        family.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        family.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        family.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter adapter_family = new WordAdapter(this, family);

        ListView listViewColors = (ListView) findViewById(R.id.list);
        listViewColors.setAdapter(adapter_family);
    }
}
