package com.zozancan.travelapp.firstfragment;


import android.view.View;
import android.widget.ImageView;

import com.zozancan.travelapp.R;
import com.zozancan.travelapp.base.BaseFragment;
import com.zozancan.travelapp.util.ActivityNavigateHelper;


public class FirstFragment extends BaseFragment {

    private ImageView imgBanking;

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initialComponents(View view) {
        imgBanking = view.findViewById(R.id.img_banking);
    }

    @Override
    protected void registerEvents() {
        imgBanking.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityNavigateHelper.openPhotoScrollActivity(getActivity());
            }
        });
    }
}
