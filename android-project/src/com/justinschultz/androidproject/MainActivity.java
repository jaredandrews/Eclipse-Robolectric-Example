
package com.justinschultz.androidproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onButton1Click(View view) {
    	Toast.makeText(this, "Button pressed!", Toast.LENGTH_SHORT).show();  
    }
    
    public void onButton2Click(View view) {
    	Intent second = new Intent(MainActivity.this, SecondActivity.class);
    	startActivity(second);
    }
}