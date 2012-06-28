package com.justinschultz.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    
    public void onButton1Click(View view) {
    	Intent third = new Intent(SecondActivity.this, ThirdActivity.class);
    	startActivity(third);
    }
}