package com.zozancan.travelapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zozancan.travelapp.base.BaseFragment;
import com.zozancan.travelapp.util.ActivityNavigateHelper;

public class InnerFragment1 extends BaseFragment {

    public InnerFragment1() {
    }

    public static InnerFragment1 newInstance() {
        return new InnerFragment1();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_inner_fragment1;
    }

    @Override
    protected void initialComponents(View view) {
    }
}
