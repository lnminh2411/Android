package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.models.Photo;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private ArrayList<Photo> photos;

    public PhotoAdapter(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public int getCount() {
        return photos.size();
    }

    @Override
    public Object getItem(int i) {
        return photos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return photos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_list_item,viewGroup,false);
        Photo photo = photos.get(i);
        ImageView imgView = view.findViewById(R.id.imgView);
        return view;
    }
}
