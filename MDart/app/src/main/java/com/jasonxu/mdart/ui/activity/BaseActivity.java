package com.jasonxu.mdart.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by t_xuz on 8/20/16.
 *
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

    }

    protected abstract int getContentViewId();

    protected void initViews(){}

    protected void initData(){}

    protected void initEvents(){}
}
