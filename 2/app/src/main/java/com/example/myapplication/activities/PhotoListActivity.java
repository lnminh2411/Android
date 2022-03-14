package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.models.Photo;

import java.util.ArrayList;

public class PhotoListActivity extends AppCompatActivity {
    private ListView listViewPhotos;
    private ArrayList<Photo> photos = new ArrayList<Photo>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_list_activity);
        listViewPhotos = findViewById(R.id.listViewPhotos);
    }
}