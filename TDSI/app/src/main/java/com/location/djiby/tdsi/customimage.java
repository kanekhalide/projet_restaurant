package com.location.djiby.tdsi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class
customimage extends BaseAdapter {

    Context c;
    String []name={"Brioche Dorée","Restaurant Farid","Restaurant G2F","La Fourchette","Restaurant la signare","Restaurant Le Lagon 1","Patisseries les Ambassades Point E"
    ,"La pampa","YUM-YUM Ouakam"};
    String []price={"ouvert","Libanaise","ouvert","ferme","ouvert","ouvert","ferme","Restaurant","Pizza"};
    int []images= {
        R.drawable.briochedoree,R.drawable.faride,R.drawable.g2f,R.drawable.fourchette,R.drawable.signature
            ,R.drawable.lagon,R.drawable.ambassadeur,R.drawable.pampa,R.drawable.yum
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
