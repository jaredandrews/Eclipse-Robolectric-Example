package com.justinschultz.tests.activity;

import android.app.Activity;
import android.widget.Button;

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

@RunWith(SampleTestRunner.class)
public class SecondActivityTest {

	@Test
    public void testWelcomeText() throws Exception {
		SecondActivity secondActivity = new SecondActivity();
		secondActivity.onCreate(null);
        String welcomeFromActivity = secondActivity.getResources().getString(R.string.second_info);
        assertThat(welcomeFromActivity, equalTo("Welcome to the second activity."));
    }
	
	@Test
	public void testButton1Change() throws Exception {
		SecondActivity secondActivity = new SecondActivity();
		secondActivity.onCreate(null);
		Button button1 = (Button) secondActivity.findViewById(R.id.button1);
		button1.performClick();
		assertThat(secondActivity, new StartedMatcher(ThirdActivity.class));
	}		
}
