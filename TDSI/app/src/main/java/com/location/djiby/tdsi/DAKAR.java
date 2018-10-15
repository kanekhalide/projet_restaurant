package com.location.djiby.tdsi;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DAKAR extends AppCompatActivity {
ImageView t;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dakar);
        t = (ImageView) findViewById(R.id.img);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              final  Intent intent = new Intent(DAKAR.this,listActivity.class);

                startActivity(intent);

            }
        });

    }
}
