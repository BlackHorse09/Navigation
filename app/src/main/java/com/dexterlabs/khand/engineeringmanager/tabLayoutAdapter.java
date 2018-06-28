package com.dexterlabs.khand.engineeringmanager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabLayoutAdapter extends FragmentStatePagerAdapter {

    String[] tabsArray = new String[]{"Question paper","Practicals","Syllabus","Tutorial"};

    public tabLayoutAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabsArray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                One one1 = new One();
                return one1;

            case 1:
                Two two2 = new Two();
                return two2;

            case 2:
                Three three3 = new Three();
                return three3;
            case 3:
                Four four4 = new Four();
                return four4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}