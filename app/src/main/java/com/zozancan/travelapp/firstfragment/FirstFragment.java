package com.zozancan.travelapp.firstfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zozancan.travelapp.R;
import com.zozancan.travelapp.util.ActivityNavigateHelper;


public class FirstFragment extends Fragment {

    private ImageView imgBanking;

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        initialComponent(view);
        registerEvents();

        return view;
    }

    private void initialComponent(View view) {
        imgBanking = view.findViewById(R.id.img_banking);
    }

    private void registerEvents() {
        imgBanking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityNavigateHelper.openPhotoScrollActivity(getActivity());
            }
        });
    }
}
