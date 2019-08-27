package com.example.pokemonnavigation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class adapterPokemon extends RecyclerView.Adapter<adapterPokemon.ViewHolder> {

    private ArrayList<Post> posts;
    private Context context;

    LayoutInflater inflater;
    private View.OnClickListener itemlisten;

    public adapterPokemon(ArrayList<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    public void setOnItemClickListener(View.OnClickListener itemClickListener) {
        itemlisten = itemClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(posts.get(position).getImage()).into(holder.ivPokeImage);
        holder.tvPokeName.setText(posts.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPokeImage;
        TextView tvPokeName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPokeImage = itemView.findViewById(R.id.ivPokeImage);
            tvPokeName =  itemView.findViewById(R.id.tvPokeName);

            itemView.setTag(this);
            itemView.setOnClickListener(itemlisten);

        }
    }
}
