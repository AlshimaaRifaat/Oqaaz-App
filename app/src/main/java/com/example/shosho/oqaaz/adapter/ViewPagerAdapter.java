package com.example.shosho.oqaaz.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.shosho.oqaaz.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    int[]images;
    LayoutInflater layoutInflater;
   // int position=3;

    public ViewPagerAdapter(Context context, int[] images) {

        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==( (RelativeLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate( R.layout.item_view_pager,container,false );
        imageView=view.findViewById( R.id.item_view_pager_image );
        imageView.setImageResource( images[position] );
        ((ViewPager)container).addView( view );
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ((ViewPager)container).removeView( (RelativeLayout)object );
    }

    @Override
    public float getPageWidth(int position) {
        return .90f;
    }
}
