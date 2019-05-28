package com.zozancan.travelapp.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public abstract class BaseFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        initialComponents(view);
        registerEvents();
        return view;
    }

    protected abstract int getLayoutId();

    protected abstract void initialComponents(View view);

    protected abstract void registerEvents();

}
