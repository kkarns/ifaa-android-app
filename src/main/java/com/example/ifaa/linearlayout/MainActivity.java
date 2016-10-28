package com.example.ifaa.linearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonMapClickHandler(View view) {
        Intent mapIntent = new Intent(this, CompassActivity.class);
        startActivity(mapIntent);
        //EditText et = (EditText) findViewById(R.id.nameText);
        //String name = et.getText().toString();
        //Snackbar.make(coordinatorLayout,
        //        "Your name is " + name, Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
    }

    public void buttonArtistClickHandler(View view) {
        Intent artistIntent = new Intent(this, ArtistActivity.class);
        startActivity(artistIntent);
        //EditText et = (EditText) findViewById(R.id.nameText);
        //String name = et.getText().toString();
        //Snackbar.make(coordinatorLayout,
        //        "Your name is " + name, Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
    }

    public void buttonSearchClickHandler(View view) {
        Intent searchIntent = new Intent(this, SearchActivity.class);
        startActivity(searchIntent);
        //EditText et = (EditText) findViewById(R.id.nameText);
        //String name = et.getText().toString();
        //Snackbar.make(coordinatorLayout,
        //        "Your name is " + name, Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
    }

    public void buttonCartClickHandler(View view) {
        Intent cartIntent = new Intent(this, CartActivity.class);
        startActivity(cartIntent);
        //EditText et = (EditText) findViewById(R.id.nameText);
        //String name = et.getText().toString();
        //Snackbar.make(coordinatorLayout,
        //        "Your name is " + name, Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show();
    }
}
