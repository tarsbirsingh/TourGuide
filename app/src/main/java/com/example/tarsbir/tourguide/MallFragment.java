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

public class MallFragment extends Fragment {
    public MallFragment() {
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
        listItems.add(new ListItem(R.drawable.mall_of_asr, getString(R.string.mall_of_ars)));
        listItems.add(new ListItem(R.drawable.trilium_mal, getString(R.string.trillium)));
        listItems.add(new ListItem(R.drawable.celebration_mal, getString(R.string.celebration)));

        CustomAdapter adapter = new CustomAdapter(getContext(),listItems);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(adapter);

        return rootView;
    }
}
