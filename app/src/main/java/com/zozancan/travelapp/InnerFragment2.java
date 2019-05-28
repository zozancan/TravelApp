package com.zozancan.travelapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InnerFragment2 extends Fragment {

    public InnerFragment2() {
        // Required empty public constructor
    }

    public static InnerFragment2 newInstance() {
        return new InnerFragment2();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inner_fragment2, container, false);
    }
}
