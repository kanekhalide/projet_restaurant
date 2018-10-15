package com.location.djiby.tdsi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class viwpaperAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private int[] images;
    private int image;
    public viwpaperAdapter(int images1) {
        this.image= images1;
    }

    @Override
    public int getCount() {
        return images.length;
    }
public viwpaperAdapter(Context c , int [] ima){
        this.context=c;
        this.images =ima;
}



    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

       layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View view = layoutInflater.inflate(R.layout.custum_layout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        imageView.setImageResource(images[position]);
        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
