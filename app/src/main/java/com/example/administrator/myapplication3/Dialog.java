package com.example.administrator.myapplication3;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/3/15.
 */

public class Dialog {

    private ImageView imageView;
    private Context context;
    private AnimationDrawable drawable;
    private View view;

    public Dialog(Context context) {
        this.context = context;
        initDialog();
    }

    private void initDialog() {
        view = LayoutInflater.from(context).inflate(R.layout.image, null);
        imageView = (ImageView) view.findViewById(R.id.img_loading);
//        imageView.setBackgroundResource();
        drawable = (AnimationDrawable) imageView.getBackground();
        drawable.start();
    }

    public void show() {
        drawable.start();
    }
}
