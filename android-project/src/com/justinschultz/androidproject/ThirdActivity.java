package com.justinschultz.androidproject;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ThirdActivity extends Activity {
	EditText edittext1;
	EditText edittext2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        
        ((EditText) findViewById(R.id.edittext1)).addTextChangedListener(new TextWatcher() {

			@Override
			public void afterTextChanged(Editable s) {
				((EditText) findViewById(R.id.edittext2)).setText(s.toString().toUpperCase());
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				
			}
        	
        }
        );
    }
    
}