package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //private GridView gridView;
    // RecyclerView recycleView;
    RecyclerView recycleViewFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        //setContentView(R.layout.main_activity);

        //setContentView(R.layout.recycle_view);

//        gridView = findViewById(R.id.gridView);

//        recycleView = findViewById(R.id.recycleCity);
//        ArrayList<City> cityList = new ArrayList<>();
//        cityList.add(new City("01", "Hà Nội", R.drawable.image_ha_noi));
//        cityList.add(new City("02", "Hồ Chí Minh", R.drawable.image_ho_chi_minh));
//        cityList.add(new City("03", "Hải Phòng", R.drawable.image_hai_phong));
//        cityList.add(new City("04", "Đà Nẵng", R.drawable.image_da_nang));
//        cityList.add(new City("05", "Hà Giang", R.drawable.image_ha_giang));
//        cityList.add(new City("06", "Hải Dương", R.drawable.image_hai_duong));
//        cityList.add(new City("07", "Hưng Yên", R.drawable.image_hung_yen));
//        cityList.add(new City("08", "Bắc Ninh", R.drawable.image_bac_ninh));

//        GridViewAdapter adapter= new GridViewAdapter(cityList);
//        gridView.setAdapter(adapter);

//        RecycleViewAdapter adapter = new RecycleViewAdapter(this,cityList);
//        recycleView.setAdapter(adapter);
//        recycleView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(new Food(
                "Burger",
                "Hawkers",
                2.99,
                "https://media.istockphoto.com/photos/cheeseburger-with-tomato-and-lettuce-on-wooden-board-picture-id1309352410?s=612x612")
        );
        foodList.add(new Food(
                "Cheese Dip",
                "Hawkers",
                4.99,
                "https://media.istockphoto.com/photos/spicy-homemade-cheesey-queso-dip-picture-id957887642?s=612x612")
        );
        foodList.add(new Food(
                "Cola",
                "McDonald",
                1.49,
                "https://media.istockphoto.com/photos/soft-drink-on-wooden-table-and-men-sitting-picture-id698051792")
        );
        foodList.add(new Food(
                "Fries",
                "McDonald",
                3.19,
                "https://media.istockphoto.com/photos/french-fries-picture-id94500987")
        );
        foodList.add(new Food(
                "Burger",
                "Hawkers",
                2.99,
                "https://media.istockphoto.com/photos/cheeseburger-with-tomato-and-lettuce-on-wooden-board-picture-id1309352410?s=612x612")
        );
        foodList.add(new Food(
                "Cheese Dip",
                "Hawkers",
                4.99,
                "https://media.istockphoto.com/photos/spicy-homemade-cheesey-queso-dip-picture-id957887642?s=612x612")
        );
        foodList.add(new Food(
                "Cola",
                "McDonald",
                1.49,
                "https://media.istockphoto.com/photos/soft-drink-on-wooden-table-and-men-sitting-picture-id698051792")
        );
        foodList.add(new Food(
                "Fries",
                "McDonald",
                3.19,
                "https://media.istockphoto.com/photos/french-fries-picture-id94500987")
        );
        recycleViewFoods = findViewById(R.id.recycleViewFoods);
        FoodAdapter adapter = new FoodAdapter(this,foodList);
        recycleViewFoods.setAdapter(adapter);
        recycleViewFoods.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

    }

}