package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {
    private List<City> cityList;


    public GridViewAdapter(List<City> cityList ) {

        this.cityList = cityList;

    }
    @Override
    public int getCount() {
        return cityList.size();
    }

    @Override
    public Object getItem(int i) {
        return cityList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return cityList.get(i).getIdImage();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        City cities = cityList.get(i);
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_item,viewGroup,false);
        ImageView imgView = view.findViewById(R.id.imgView);
        TextView txtId = view.findViewById(R.id.txtId);
        TextView txtName = view.findViewById(R.id.txtName);
        imgView.setImageResource(cities.getIdImage());
        txtId.setText("STT:"+cities.getId());
        txtName.setText("Tên:"+cities.getName());
        return view;
    }
}
