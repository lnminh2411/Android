package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view_activity);
        Photo anh1 = new Photo("Anh 1", R.drawable.a);
        Photo anh2 = new Photo("Anh 2", R.drawable.b);
        Photo anh3 = new Photo("Anh 3", R.drawable.c);
        Photo anh4 = new Photo("Anh 4", R.drawable.d);
        Photo anh5 = new Photo("Anh 5", R.drawable.e);
        Photo anh6 = new Photo("Anh 6", R.drawable.f);
        Photo anh7 = new Photo("Anh 7", R.drawable.g);
        Photo anh8 = new Photo("Anh 8", R.drawable.h);
        Photo photos[] = new Photo[]{anh1, anh2, anh3, anh4, anh5, anh6, anh7, anh8};
        ArrayAdapter<Photo> arrayAdapter
                = new ArrayAdapter<Photo>(this, android.R.layout.simple_list_item_1, photos);


        gridView.setAdapter(arrayAdapter);

        // When the user clicks on the GridItem
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Photo photo = (Photo) o;
                Toast.makeText(GridViewActivity.this, "Selected :" + " " + photo.getTitle() + "\n(" + photo.getId() + ")",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}