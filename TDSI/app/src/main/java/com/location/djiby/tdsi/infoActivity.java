package com.location.djiby.tdsi;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {
int pos =0;ViewPager viewPager;
ImageView imageView;ImageView imageView2;
    int []images1= {
            R.drawable.briochedoree,R.drawable.b1,R.drawable.b2,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8
            ,R.drawable.b9 };
    int []images2= {
            R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,   R.drawable.f6,R.drawable.f7,R.drawable.f8
    };
    int []images3= {
            R.drawable.g1,R.drawable.g2,R.drawable.g3,R.drawable.g4,R.drawable.g6,R.drawable.g7,R.drawable.g8,R.drawable.g10,R.drawable.g11
    };
    int []images4= {
            R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,R.drawable.r7, R.drawable.r8,R.drawable.r10
    };
    int []images5= {
            R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,R.drawable.s6
    };
    int []images6= {
            R.drawable.l1,R.drawable.l2,R.drawable.l3,R.drawable.l5,R.drawable.l6,R.drawable.l7,R.drawable.l8
    };
    int []images7= {
            R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4
    };
    int []images8= {
            R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10
    };
    int []images9= {
            R.drawable.y1,R.drawable.y2,R.drawable.y3,R.drawable.y4,R.drawable.y5,R.drawable.y6
    };
    int tableauImage[][] = { images1,images2,images3,images4,images5,images6,images7,images8,images9};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Intent intent = getIntent();
        pos = intent.getExtras().getInt("Position");
       final customimage customimage = new customimage(this);
      //  final ImageView imageView = (ImageView) findViewById(R.id.imgid);
        final TextView textView = (TextView) findViewById(R.id.name);
        final TextView price = (TextView) findViewById(R.id.price);
      //  imageView.setImageResource(customimage.images[pos]);
        textView.setText(customimage.name[pos]);
       price.setText(customimage.price[pos]);
        Button btn = (Button)findViewById(R.id.btnext);
        viewPager = (ViewPager) findViewById(R.id.viewpaper);

 imageView = (ImageView) findViewById(R.id.imageView11);

        imageView2 = (ImageView) findViewById(R.id.imageView12);
        viwpaperAdapter viwpaperAdapter = new viwpaperAdapter(this,images1);
        viewPager.setAdapter(viwpaperAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = pos +1;
                new viwpaperAdapter(images1[pos]);
              //  imageView.setImageResource(customimage.images[pos]);
                textView.setText(customimage.name[pos]);
        price.setText(customimage.price[pos]);
                if(!(position>=customimage.getCount()-1)){
                    pos +=1;

                }else
                {
                    pos = -1;
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( Intent.ACTION_DIAL, Uri.parse("tel:771847904") ));
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("www.lacgaa.sn");
                startActivity(new Intent( Intent.ACTION_VIEW,uri ));
            }
        });
    }
}
