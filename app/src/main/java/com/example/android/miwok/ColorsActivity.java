 package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

 public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        ArrayList<Word> colors = new ArrayList<>();

        colors.add(new Word("red", "wetetti", R.drawable.color_red));
        colors.add(new Word("green", "chokokko", R.drawable.color_green));
        colors.add(new Word("brown", "takaakki", R.drawable.color_brown));
        colors.add(new Word("gray", "topoppi", R.drawable.color_gray));
        colors.add(new Word("black", "kululli", R.drawable.color_black));
        colors.add(new Word("white", "kelelli", R.drawable.color_white));
        colors.add(new Word("dusty yellow", "topiisa", R.drawable.color_dusty_yellow));
        colors.add(new Word("mustard yellow", "chiwiita", R.drawable.color_mustard_yellow));

        WordAdapter adapter_colors = new WordAdapter(this, colors);

        ListView listViewColors = (ListView) findViewById(R.id.list);
        listViewColors.setAdapter(adapter_colors);
    }
}
