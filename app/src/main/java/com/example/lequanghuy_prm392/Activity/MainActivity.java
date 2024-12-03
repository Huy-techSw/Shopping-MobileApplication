package com.example.lequanghuy_prm392.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.lequanghuy_prm392.Adapter.PopularAdapter;
import com.example.lequanghuy_prm392.R;
import com.example.lequanghuy_prm392.databinding.ActivityMainBinding;
import com.example.lequanghuy_prm392.domain.PopularDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusBarColor();
        initRecycleView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void statusBarColor() {
        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.purple_Dark));
    }

    private void initRecycleView(){
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("T-shirt black","item_1",15,4,500,"Immerse yourself in a world of vibrant visuals and\n" +
                "immersive sound with the monitor.\n" +
                "Its cutting-edge monitor technology brings every\n" +
                "scene to life with striking clarity and rich colors.\n" +
                "With seamless integration and a sleek, modern\n" +
                "design, the monitor Pro is not just a monitor, but a\n" +
                "centerpiece for your entertainment space.\n" +
                "With its sleek, modern design, the monitor is\n" +
                "not just a TV, but a centerpiece for your\n" +
                "entertainment space. The ultra-slim bezel and\n" +
                "premium finish blend seamlessly with any decor"));
        items.add(new PopularDomain("Smart watch","item_2",10,4.5,450,"Immerse yourself in a world of vibrant visuals and\n" +
                "immersive sound with the monitor.\n" +
                "Its cutting-edge monitor technology brings every\n" +
                "scene to life with striking clarity and rich colors.\n" +
                "With seamless integration and a sleek, modern\n" +
                "design, the monitor Pro is not just a monitor, but a\n" +
                "centerpiece for your entertainment space.\n" +
                "With its sleek, modern design, the monitor is\n" +
                "not just a TV, but a centerpiece for your\n" +
                "entertainment space. The ultra-slim bezel and\n" +
                "premium finish blend seamlessly with any decor"));
        items.add(new PopularDomain("Phone","item_3",3,4.9,800,"Immerse yourself in a world of vibrant visuals and\n" +
                "immersive sound with the monitor.\n" +
                "Its cutting-edge monitor technology brings every\n" +
                "scene to life with striking clarity and rich colors.\n" +
                "With seamless integration and a sleek, modern\n" +
                "design, the monitor Pro is not just a monitor, but a\n" +
                "centerpiece for your entertainment space.\n" +
                "With its sleek, modern design, the monitor is\n" +
                "not just a TV, but a centerpiece for your\n" +
                "entertainment space. The ultra-slim bezel and\n" +
                "premium finish blend seamlessly with any decor"));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}