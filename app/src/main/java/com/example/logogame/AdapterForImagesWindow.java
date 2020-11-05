package com.example.logogame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterForImagesWindow extends RecyclerView.Adapter<AdapterForImagesWindow.MyViewHolder> {
    ArrayList<LogoItem> data ;
    InsideLevel.OnFragmentInteractionListener listener ;

    public AdapterForImagesWindow(ArrayList<LogoItem> data, InsideLevel.OnFragmentInteractionListener listener) {
        this.data = data;
        this.listener = listener ;
    }

    @NonNull
    @Override
    public AdapterForImagesWindow.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View logoModel = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_window, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(logoModel);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.initImage(position);
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }






     // INNER CLASS //
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView ;
        int position ;

         public void setPosition(int position) {
             this.position = position;
         }

         public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_window) ;

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
if (listener != null)
    listener.onFragmentInteraction(position);
                }
            });
        }

         public void initImage ( int position) {
         imageView.setImageResource(data.get(position).imageResource);
         }
    }

}
