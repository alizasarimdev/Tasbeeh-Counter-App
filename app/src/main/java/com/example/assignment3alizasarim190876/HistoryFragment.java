package com.example.assignment3alizasarim190876;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {

    private ListView historyListView;
    private List<String> historyList;
    private ArrayAdapter<String> historyAdapter;

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        historyListView = view.findViewById(R.id.historyListView);
        historyList = new ArrayList<>();
        historyAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, historyList);
        historyListView.setAdapter(historyAdapter);
        return view;
    }
}
