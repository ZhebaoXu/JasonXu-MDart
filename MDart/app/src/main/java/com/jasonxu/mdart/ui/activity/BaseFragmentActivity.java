package com.jasonxu.mdart.ui.activity;

import android.support.v4.app.Fragment;
import android.view.KeyEvent;

import java.util.List;

/**
 * Created by t_xuz on 8/20/16.
 * 供流式fragment的使用
 */
public abstract class BaseFragmentActivity extends BaseActivity {

    protected abstract int getFragmentContainerId();

    //add fragment
    protected void addFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .add(getFragmentContainerId(),fragment,fragment.getClass().getSimpleName())
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commitAllowingStateLoss();
        }

    }

    //remove fragment by tagId
    protected void removeFragment(Fragment fragment){
        List<Fragment> fragmentList = getSupportFragmentManager().getFragments();
        for (Fragment myFragment : fragmentList){
            if (myFragment.getTag().equalsIgnoreCase(fragment.getTag())){
                getSupportFragmentManager().beginTransaction()
                        .remove(fragment)
                        .commitAllowingStateLoss();
            }
        }
    }

    //remove fragment
    protected void removeFragment(){
        if (getSupportFragmentManager().getBackStackEntryCount()>1){
            getSupportFragmentManager().popBackStack();
        }else {
            finish();
        }
    }


    //返回健监听,当返回栈中只剩一个fragment的时候才会销毁当前 activity
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == keyCode){
            if (getSupportFragmentManager().getBackStackEntryCount() == 1){
                finish();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
