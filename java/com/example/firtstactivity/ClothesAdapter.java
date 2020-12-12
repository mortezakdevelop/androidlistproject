package com.example.firtstactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesAdapter.newsViewHolder> {

    private final Context context;
    private final List<ClothesModel> posts;

    public ClothesAdapter(Context context, List<ClothesModel> posts){
        this.context = context;
        this.posts = posts;
    }
    @NonNull
    @Override
    public newsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_clothes,parent,false);
        return new newsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull newsViewHolder holder, int position) {
        ClothesModel post = posts.get(position);
        holder.newsImage.setImageDrawable(post.getPostImage());
         holder.title.setText(post.getTitle());
         holder.content.setText(post.getContent());
         holder.date.setText(post.getDate());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class newsViewHolder extends RecyclerView.ViewHolder{

        private final ImageView newsImage;
        private final TextView title;
        private final TextView content;
        private final TextView date;

        public newsViewHolder(@NonNull View itemView) {
            super(itemView);
            newsImage = itemView.findViewById(R.id.item_image);
             title = itemView.findViewById(R.id.news_title);
             content = itemView.findViewById(R.id.news_content);
             date = itemView.findViewById(R.id.news_date);




        }
    }
}
