package com.example.liaomatt.assign2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class DisplayImages extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);

        //Initialize ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        //Loading image from below url into imageView

        Picasso.with(this)
                .load("http://i.cs.hku.hk/~mwclark/php/pics/AMS_view.jpg")
                .into(imageView);
    }



}
