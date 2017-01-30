package com.example.kazaf.mytablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private String[] mTitles = new String[]{"1", "2", "3","4"};

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new Fragment2();
        } else if (position == 2) {
            return new Fragment3();
        }
        return new Fragment1();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    public View getTabView(int position) {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
        View v = LayoutInflater.from(context).inflate(R.layout.item_tab, null);
        TextView title = (TextView) v.findViewById(R.id.tv_item_tab);
        ImageView icon = (ImageView) v.findViewById(R.id.img_item_tab);
        title.setText(mTitles[position]);
        icon.setImageResource(R.drawable.selector_icon_1);
//        icon.setImageDrawable(R.drawable.);


        if (position==0){
            View divider = (View) v.findViewById(R.id.divider_item_tab);
            divider.setVisibility(View.INVISIBLE);
        }

        return v;
    }

}
