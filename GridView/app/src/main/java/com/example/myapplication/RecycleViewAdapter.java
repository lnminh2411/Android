package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<City> cityList;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgView;
        private TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.imgView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }

    public RecycleViewAdapter(Context mContext, ArrayList<City> cityList) {
        this.context = mContext;
        this.cityList = cityList;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View heroView = inflater.inflate(R.layout.recycle_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(heroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder holder, int position) {
        City city = cityList.get(position);
        holder.imgView.setImageResource(city.getIdImage());
        holder.txtName.setText(city.getName());
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }
}
