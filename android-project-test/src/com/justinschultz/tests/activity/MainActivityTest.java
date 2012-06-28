package com.justinschultz.tests.activity;

import android.widget.Button;

import com.justinschultz.androidproject.MainActivity;
import com.justinschultz.androidproject.R;
import com.justinschultz.androidproject.SecondActivity;
import com.justinschultz.tests.runner.SampleTestRunner;
import com.xtremelabs.robolectric.matchers.StartedMatcher;
import com.xtremelabs.robolectric.shadows.ShadowHandler;
import com.xtremelabs.robolectric.shadows.ShadowToast;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SampleTestRunner.class)
public class MainActivityTest {
	@Test
    public void testBasicResourceValue() throws Exception {
        String helloFromActivity = new MainActivity().getResources().getString(R.string.hello);
        assertThat(helloFromActivity, equalTo("Hello World, MainActivity!"));
    }
	
	@Test
	public void testAppName() throws Exception {
		String appName = new MainActivity().getResources().getString(R.string.app_name);
		assertThat(appName, equalTo("android-project"));
	}
	
	@Test
	public void testThatFails() throws Exception {
		assertThat(4, equalTo(2+2));
	}
	
	@Test
	public void testButton1Toast() throws Exception {
		MainActivity mainActivity = new MainActivity();	
		mainActivity.onCreate(null);
		Button button1 = (Button) mainActivity.findViewById(R.id.button1);
		button1.performClick();
		ShadowHandler.idleMainLooper();
		assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Button clicked!"));
	}
	
	@Test
	public void testButton2Change() throws Exception {
		MainActivity mainActivity = new MainActivity();
		mainActivity.onCreate(null);
		Button button2 = (Button) mainActivity.findViewById(R.id.button2);
		button2.performClick();
		assertThat(mainActivity, new StartedMatcher(SecondActivity.class));
	}
}
