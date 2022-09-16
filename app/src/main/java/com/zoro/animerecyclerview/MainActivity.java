package com.zoro.animerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String>animeList=new ArrayList<>();
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        animeList.add("One Piece");
        animeList.add("Naruto");
        animeList.add("One Punchmen");
        animeList.add("Berserk");
        animeList.add("Bakugan");
        animeList.add("Bleach");
        animeList.add("Jyjutsu kaisen");
        animeList.add("JOJO");
        animeList.add("elite classe");
        animeList.add("ataka titan");
        animeList.add("death note");
        animeList.add("initianal di");
        animeList.add("initianal di");
        animeList.add("tokyo ghoul");
        animeList.add("kimetsu no yaiba");
        animeList.add("xanter x xanter");
        animeList.add("haikyuu");
        animeList.add("class kill");
        animeList.add("parajite");
        animeList.add("magic health");
        animeList.add("akame ga kill");
        animeList.add("evangelion");
        animeList.add("overlord");
        animeList.add("dragonball");
        animeList.add("boku no piko");
        animeList.add("Baki the Grappler");
        AnimeAdapter adapter1 = new AnimeAdapter(animeList);
        recyclerView.setAdapter(adapter1);
    }
}