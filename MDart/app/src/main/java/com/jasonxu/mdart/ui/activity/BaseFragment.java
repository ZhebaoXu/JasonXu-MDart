package com.jasonxu.mdart.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by t_xuz on 8/20/16.
 *
 */
public abstract class BaseFragment extends Fragment{

    protected BaseActivity mContext;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = (BaseActivity)context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initData();
        initViews();
        initEvents();
        return inflater.inflate(getContentViewId(),container,false);
    }

    protected abstract int getContentViewId();

    protected abstract void initViews();

    protected void initData(){}

    protected void initEvents(){}
}
