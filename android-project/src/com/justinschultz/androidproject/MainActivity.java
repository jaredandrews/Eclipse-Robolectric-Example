package com.justinschultz.androidproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onButtonClick(View view) {
    	Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();  
    }
}