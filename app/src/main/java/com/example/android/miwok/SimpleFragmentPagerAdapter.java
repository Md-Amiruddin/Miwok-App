package com.example.android.miwok;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter (FragmentManager fm) {super(fm);}

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new NumbersFragment();
        }else if(position == 1){
            return new FamilyFragment();
        }else if(position == 2){
            return  new ColorsFragment();
        }else{
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if(position==0){
            return "Numbers";
        }else if(position == 1){
            return "Family";
        }else if(position == 2){
            return "Colors";
        }else{
            return "Phrases";
        }
    }
}
