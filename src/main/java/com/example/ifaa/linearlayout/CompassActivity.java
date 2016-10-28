package com.example.ifaa.linearlayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class CompassActivity extends AppCompatActivity {

    GPSTracker gps;
    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //https://xjaphx.wordpress.com/2011/10/02/store-and-use-files-in-assets/
        mImage = (ImageView)findViewById(R.id.imageView2);
        loadDataFromAsset();
    }
    public void loadDataFromAsset() {

        // load image
        try {
            // get input stream
            //InputStream ims = getAssets().open("avatar.jpg");
            InputStream ims = getAssets().open("images/2015-ifaa-booth-map-page-001.jpg");
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            mImage.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
    }


    public void buttonLocateClickHandler(View view) {
        gps = new GPSTracker(CompassActivity.this);

        // check if GPS enabled
        if(gps.canGetLocation()){

            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();
            Log.d("latitude", String.valueOf(latitude));
            Log.d("longitude", String.valueOf(longitude));
            // \n is for new line
            Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
        }else{
            // can't get location
            // GPS or Network is not enabled
            // Ask user to enable GPS/network in settings
            gps.showSettingsAlert();
        }

        //EditText et = (EditText) findViewById(R.id.nameText);
        //String name = et.getText().toString();
        //Snackbar.make(coordinatorLayout,
        //        "Your name is " + name, Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
    }

/*
*/

}
