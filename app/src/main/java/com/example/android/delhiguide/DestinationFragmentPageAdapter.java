package com.example.android.delhiguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class DestinationFragmentPageAdapter extends FragmentPagerAdapter {

    private final String [] tabs = new String[]{"Monuments","Food Courts","Religious Places","Parks","Shopping Areas"};
    public DestinationFragmentPageAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new MonumentFragment();
        }
        else {
            return new MonumentFragment();
        }

    }
    @Override
    public int getCount() {
        return 1;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
