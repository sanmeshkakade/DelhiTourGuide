package com.example.android.delhiguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DestinationDetailsFiller extends AppCompatActivity {
    Destination destination;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        destination = (Destination) getIntent().getSerializableExtra("currentDestination");
        setContentView(R.layout.destination_blank);
        setTitle(destination.getDestination().toUpperCase());
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.destination_container,new DestinationFragment(destination))
                .commit();
    }
}
