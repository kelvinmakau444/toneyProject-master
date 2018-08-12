package com.tonney.shop.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.tonney.shop.fragment.CasualFragment;
import com.tonney.shop.fragment.IndexFragment;
import com.tonney.shop.fragment.MenFragment;
import com.tonney.shop.fragment.WomenFragment;
import com.tonney.shop.utils.CustomApplication;

public class CustomFragmentPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

    private static final int FRAGMENT_COUNT = 4;

    private Context context;

    public CustomFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new IndexFragment();
            case 1:
                return new MenFragment();
            case 2:
                return new WomenFragment();
            case 3:
                return new CasualFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.d(TAG, " Position " + position);
        String titles = ((CustomApplication)context.getApplicationContext()).getShared().getTabTitles();
        Log.d(TAG, " Titles  " + titles);
        String[] mTitles = titles.split(",");
        return mTitles[position].toUpperCase();
    }
}
