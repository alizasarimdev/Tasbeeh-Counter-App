package com.example.assignment3alizasarim190876;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TasbeehFragment extends Fragment {

    private int counter = 0;
    private TextView counterTextView;
    private Button countButton;

    public TasbeehFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tasbeeh, container, false);
        counterTextView = view.findViewById(R.id.counterTextView);
        countButton = view.findViewById(R.id.countButton);
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });
        return view;
    }
}
