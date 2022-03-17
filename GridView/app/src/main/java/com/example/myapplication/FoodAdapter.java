package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private ArrayList<Food> foodList;
    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View foodView = inflater.inflate(R.layout.food_item, parent, false);
        FoodAdapter.ViewHolder viewHolder = new FoodAdapter.ViewHolder(foodView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewFoodName.setText(foodList.get(position).getFoodName());
        holder.textViewDescription.setText(foodList.get(position).getDescription());
        holder.textViewPrice.setText(String.format("$ %f", foodList.get(position).getPrice()));
        Picasso.get().load(foodList.get(position).getUrl()).into(holder.imageViewFood);
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewFoodName;
        private TextView textViewDescription;
        private TextView textViewPrice;
        private ImageView imageViewFood;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewFoodName = itemView.findViewById(R.id.textViewFoodName);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageViewFood = itemView.findViewById(R.id.imageViewFood);
        }
    }

    public FoodAdapter(Context mContext, ArrayList<Food> foodList) {
        this.context = mContext;
        this.foodList = foodList;
    }
}
