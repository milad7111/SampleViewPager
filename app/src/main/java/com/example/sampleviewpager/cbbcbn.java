package com.example.sampleviewpager;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class cbbcbn extends SmartFragmentStatePagerAdapter {
    private List<String> jlist = new ArrayList<String>();

    public cbbcbn(FragmentManager fragmentManager) {
        super(fragmentManager);
        jlist.add("hey 1");
        jlist.add("hey 2");
        jlist.add("hey 3");
        jlist.add("hey 4");
        jlist.add("hey 5");
        jlist.add("hey 6");
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return jlist.size() + 1;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        if (position != getCount() - 1)
            return PlusOneFragment.newInstance(jlist.get(position));
        else
            return NewObjectFragment.newInstance();
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

//    @Override
//    public int getItemPosition(Object object) {
//        // this method will be called for every fragment in the ViewPager
//        if (object instanceof PlusOneFragment) {
//            return POSITION_UNCHANGED; // don't force a reload
//        } else {
//            // POSITION_NONE means something like: this fragment is no longer valid
//            // triggering the ViewPager to re-build the instance of this fragment.
//            return POSITION_NONE;
//        }
//    }
}