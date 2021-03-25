package com.example.android.delhiguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DestinationFragmentAdapter extends ArrayAdapter<Destination> {

    public DestinationFragmentAdapter(Context context,ArrayList<Destination> destinationArrayList){
        super(context, 0,destinationArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the destination object at the position
        Destination currentDestination = getItem(position);

        //get the existing view if it exist
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView itemName = listItemView.findViewById(R.id.item_name);

        itemName.setText(currentDestination.getDestination());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),DestinationDetailsFiller.class);
                intent.putExtra("currentDestination",currentDestination);
                getContext().startActivity(intent);

            }
        });

        return  listItemView;
    }
}
