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

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(R.drawable.radisson, getString(R.string.hotel1)));
        listItems.add(new ListItem(R.drawable.holidayinn, getString(R.string.hotel2)));
        listItems.add(new ListItem(R.drawable.hyatt, getString(R.string.hotel3)));
        listItems.add(new ListItem(R.drawable.tajswarna, getString(R.string.hotel4)));

        CustomAdapter adapter = new CustomAdapter(getContext(),listItems);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(adapter);

        return rootView;
    }
}
