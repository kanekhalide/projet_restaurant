package com.location.djiby.tdsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {
int pos =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Intent intent = getIntent();
        pos = intent.getExtras().getInt("Position");
       final customimage customimage = new customimage(this);
        final ImageView imageView = (ImageView) findViewById(R.id.imgid);
        final TextView textView = (TextView) findViewById(R.id.name);
        final TextView price = (TextView) findViewById(R.id.price);
        imageView.setImageResource(customimage.images[pos]);
        textView.setText(customimage.name[pos]);
        price.setText(customimage.price[pos]);
        Button btn = (Button)findViewById(R.id.btnext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = pos +1;
                imageView.setImageResource(customimage.images[pos]);
                textView.setText("Nom : "+ customimage.name[pos]);
                price.setText("Status :" +customimage.price[pos]);
                if(!(position>=customimage.getCount()-1)){
                    pos +=1;

                }else
                {
                    pos =-1;
                }
            }
        });
    }
}
