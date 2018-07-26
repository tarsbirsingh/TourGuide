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

public class SightsFragment extends Fragment {
    public SightsFragment() {
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
        listItems.add(new ListItem(R.drawable.gobindgarhfort, getString(R.string.sight1)));
        listItems.add(new ListItem(R.drawable.khalsacollege, getString(R.string.sight2)));
        listItems.add(new ListItem(R.drawable.waghaborder, getString(R.string.sight3)));
        listItems.add(new ListItem(R.drawable.warmemorial, getString(R.string.sight4)));

        CustomAdapter adapter = new CustomAdapter(getContext(),listItems);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(adapter);

        return rootView;
    }
}
