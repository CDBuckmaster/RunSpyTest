package com.example.runspyrun.test;

import junit.framework.TestCase;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import com.example.runspyrun.MainActivity;
import com.example.runspyrun.DefendActivity;
import com.jayway.android.robotium.solo.Solo;

public class TestMain extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private Solo solo;
	
	public TestMain() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testAddress(){
		solo.clickOnButton("Make a course");
		solo.assertCurrentActivity("message", "DefendActivity");
	}

	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
