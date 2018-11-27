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
import android.widget.TextView;

import com.example.shosho.oqaaz.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    int[]images;
    String []Names;
    String []Descriptions;
    LayoutInflater layoutInflater;
   // int position=3;


    public ViewPagerAdapter(Context context, int[] images, String[] names, String[] descriptions) {
        this.context = context;
        this.images = images;
        Names = names;
        Descriptions = descriptions;
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
        TextView textNames;
        TextView textDescriptions;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate( R.layout.item_view_pager,container,false );
        imageView=view.findViewById( R.id.item_view_pager_image );
        textNames=view.findViewById( R.id.item_view_pager_text_name );
        textDescriptions=view.findViewById( R.id.item_view_pager_text_description );

        imageView.setImageResource( images[position] );
        textNames.setText(Names[position]);
        textDescriptions.setText(Descriptions[position]);

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
