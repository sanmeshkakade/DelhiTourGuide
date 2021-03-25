package com.example.android.delhiguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class DestinationFragment extends Fragment {
    Destination destination=null;
    public DestinationFragment(Destination destination) {
        super();
        this.destination = destination;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View destinationView = inflater.inflate(R.layout.destination_fragment,container,false);

        if(destination!=null){

            TextView destinationName = (TextView)destinationView.findViewById(R.id.destination_text_view);
            destinationName.setText(destination.getDestination());

            ImageView destinationImage = (ImageView)destinationView.findViewById(R.id.destination_image);
            destinationImage.setImageResource(destination.getImageId());

            TextView destinationLocation = destinationView.findViewById(R.id.destination_location);
            destinationLocation.setText(destination.getLocation());

            TextView destinationNearestMetroStation = destinationView.findViewById(R.id.destination_nearest_metro_station);
            destinationNearestMetroStation.setText(destination.getNearestMetroStation());

            TextView destinationEntryTime = destinationView.findViewById(R.id.destination_entry_time);
            destinationEntryTime.setText(destination.getTimings());

            TextView destinationEntryCharge = destinationView.findViewById(R.id.destination_entry_charge);
            destinationEntryCharge.setText(destination.getEntryFee());

            TextView destinationInfo = destinationView.findViewById(R.id.destination_info);
            destinationInfo.setText(destination.getInfo());

            TextView destinationMoreInfo = destinationView.findViewById(R.id.destination_more_info);
            destinationMoreInfo.setText(destination.getMoreInfo());
        }
        return destinationView;
    }
}
