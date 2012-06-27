package com.justinschultz.tests.activity;

import com.justinschultz.androidproject.MainActivity;
import com.justinschultz.androidproject.R;
import com.justinschultz.tests.runner.SampleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SampleTestRunner.class)
public class SampleTest {
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
}
