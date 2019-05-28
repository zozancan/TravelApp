package com.zozancan.travelapp.util;

import android.content.Context;
import android.content.Intent;

import com.zozancan.travelapp.firstfragment.PhotosScroll;

public final class ActivityNavigateHelper {

    private ActivityNavigateHelper() {

    }

    public static void openPhotoScrollActivity(Context context) {
        Intent intent = new Intent(context, PhotosScroll.class);
        context.startActivity(intent);
    }
}