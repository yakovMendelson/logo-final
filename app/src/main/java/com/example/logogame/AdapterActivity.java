package com.example.logogame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ViewHolder> {

            private OnLevelClicked onLevelClicked;
    private LayoutInflater mInflater;
    public AdapterActivity(Context context, OnLevelClicked listener) {

            onLevelClicked=listener;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_levle, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.indViewHolder(position);
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView title;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.IL_count);
                itemView.setOnClickListener(this);
        }
        public void indViewHolder(Integer pos) {
            title.setText(String.valueOf(pos+1));
        }


            @Override
            public void onClick(View v) {
                if (onLevelClicked==null)return;
              onLevelClicked.onLevelClicked(getAdapterPosition());
            }
    }

}

