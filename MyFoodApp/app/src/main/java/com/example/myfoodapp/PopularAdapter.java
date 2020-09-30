package com.example.myfoodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.model.Popular;

import org.w3c.dom.Text;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder> {

    private Context context;
    private List<Popular> popularList;

    public PopularAdapter(Context context, List<Popular> popularList) {
        this.context = context;
        this.popularList = popularList;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.id);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return popularList.size();
    }


    public static class PopularViewHolder extends RecyclerView.ViewHolder{
        public PopularViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
