package com.jasonxu.mdart.ui.activity;

import android.support.annotation.Nullable;
import android.os.Bundle;

import com.jasonxu.commonlibrary.base.BaseActivity;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected int getContentViewId() {
        return 0;
    }
}
