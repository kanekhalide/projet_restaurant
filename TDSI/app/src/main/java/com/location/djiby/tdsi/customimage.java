package com.location.djiby.tdsi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customimage extends BaseAdapter {

    Context c;
    String []name={"restaurant1","restaurant2","restaurant3","restaurant4","restaurant5"};
    String []price={"ouvert","ferme","ouvert","ferme","ouvert"};
    int []images= {
        R.drawable.images1,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5
    };
    @Override
    public int getCount() {
        return name.length;
    }
    public customimage(Context c){
        this.c=c;
    }

    @Override
    public Object getItem(int pos) {
        return name[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.restaurant,null);
        }

        TextView nametxt = (TextView) view.findViewById(R.id.name);
        TextView pricetxt = (TextView) view.findViewById(R.id.price);
        ImageView imagetxt = (ImageView) view.findViewById(R.id.imgid);
        nametxt.setText(name[i]);
        pricetxt.setText(price[i]);
        imagetxt.setImageResource(images[i]);
        return view;
    }
}
