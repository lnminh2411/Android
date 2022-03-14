package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        gridView = findViewById(R.id.gridView);
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("01", "Hà Nội", R.drawable.image_ha_noi));
        cityList.add(new City("02", "Hồ Chí Minh", R.drawable.image_ho_chi_minh));
        cityList.add(new City("03", "Hải Phòng", R.drawable.image_hai_phong));
        cityList.add(new City("04", "Đà Nẵng", R.drawable.image_da_nang));
        cityList.add(new City("05", "Hà Giang", R.drawable.image_ha_giang));
        cityList.add(new City("06", "Hải Dương", R.drawable.image_hai_duong));
        cityList.add(new City("07", "Hưng Yên", R.drawable.image_hung_yen));
        cityList.add(new City("08", "Bắc Ninh", R.drawable.image_bac_ninh));
        GridViewAdapter adapter= new GridViewAdapter(cityList);
        gridView.setAdapter(adapter);

    }

}