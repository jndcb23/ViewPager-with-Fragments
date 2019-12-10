package com.pa.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FragmentTabOne();
        }
        else if(position==1){
            return new FragmentTabTwo();
        }
        else if (position==2){
            return new FragmentTabThree();
        }
        else{
            return new FragmentTabFour();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
