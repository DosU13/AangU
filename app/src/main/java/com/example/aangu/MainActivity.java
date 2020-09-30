package com.example.aangu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_water, R.id.navigation_earth, R.id.navigation_fire, R.id.navigation_air)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        BottomNavigationItemView waterMenu = findViewById(R.id.navigation_water);
        BottomNavigationItemView earthMenu = findViewById(R.id.navigation_earth);
        BottomNavigationItemView fireMenu = findViewById(R.id.navigation_fire);
        BottomNavigationItemView airMenu = findViewById(R.id.navigation_air);
        waterMenu.setIconTintList(null);
        earthMenu.setIconTintList(null);
        fireMenu.setIconTintList(null);
        airMenu.setIconTintList(null);
    }

}