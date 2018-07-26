package com.example.tarsbir.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ListItem> {
     CustomAdapter(@NonNull Context context, ArrayList<ListItem> listItems) {
        super(context,0,listItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.card_item,parent,false);
        }
        ListItem currentItem = getItem(position);
        TextView name = view.findViewById(R.id.textNameId);
        ImageView imageView = view.findViewById(R.id.imageId);

        assert currentItem!=null;
        name.setText(currentItem.getNameRes());
        imageView.setImageResource(currentItem.getImageRes());
        return view;
    }
}
