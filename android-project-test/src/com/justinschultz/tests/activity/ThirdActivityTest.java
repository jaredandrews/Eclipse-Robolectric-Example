package com.justinschultz.tests.activity;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.justinschultz.androidproject.MainActivity;
import com.justinschultz.androidproject.R;
import com.justinschultz.androidproject.SecondActivity;
import com.justinschultz.androidproject.ThirdActivity;
import com.justinschultz.tests.runner.SampleTestRunner;
import com.xtremelabs.robolectric.matchers.StartedMatcher;
import com.xtremelabs.robolectric.shadows.ShadowHandler;
import com.xtremelabs.robolectric.shadows.ShadowToast;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@RunWith(SampleTestRunner.class)
public class ThirdActivityTest {
	/* ThirdActivity being developed in a TDD manner */
	@Test
	public void thirdActivityWelcomeTest() throws Exception {
		ThirdActivity thirdActivity = new ThirdActivity();
		thirdActivity.onCreate(null);
		String welcomeFromActivity = thirdActivity.getResources().getString(R.string.third_info);
        assertThat(welcomeFromActivity, equalTo("Welcome to the third activity."));
	}
	
	@Test
	public void thirdActivityUppercaseTest() throws Exception {
		ThirdActivity thirdActivity = new ThirdActivity();
		thirdActivity.onCreate(null);
		EditText edittext1 = (EditText) thirdActivity.findViewById(R.id.edittext1);
		EditText edittext2 = (EditText) thirdActivity.findViewById(R.id.edittext2);
		edittext1.setText("Google is your friend.");
		String edittext2String = edittext2.getText().toString();
		assertThat(edittext2String, equalTo("GOOGLE IS YOUR FRIEND."));
	}	
	
	@Test
	public void thisTestFails() throws Exception {
		fail();
	}

}
