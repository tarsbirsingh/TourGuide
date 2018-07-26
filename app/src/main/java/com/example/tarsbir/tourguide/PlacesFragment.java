package com.example.tarsbir.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {
    public PlacesFragment() {
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(R.drawable.harimandirsahib, getString(R.string.place1)));
        listItems.add(new ListItem(R.drawable.atalrai, getString(R.string.place2)));
        listItems.add(new ListItem(R.drawable.ramtirth, getString(R.string.place3)));
        listItems.add(new ListItem(R.drawable.jalianwalabagh, getString(R.string.place4)));

        CustomAdapter adapter = new CustomAdapter(getContext(),listItems);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(adapter);

        return rootView;
    }
}
