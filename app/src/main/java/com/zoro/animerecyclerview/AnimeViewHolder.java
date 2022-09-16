package com.zoro.animerecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimeViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_anime;
    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_anime=itemView.findViewById(R.id.tv_animal);
    }
    public void bind(String animeName){
        tv_anime.setText(animeName);
    }
}
