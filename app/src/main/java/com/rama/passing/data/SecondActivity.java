package com.rama.passing.data;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ramon on 05/12/2016.
 */

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		// Extract the name and phone from the intent
		String name=getIntent().getStringExtra("PERSON_NAME");
		long phoneNumber=getIntent().getLongExtra("PHONE_NUMBER", 0);
		String str ="NAME: " + name + "\nPHONE: " + phoneNumber;
		
		//Here we are just showing retrieved data from first activity on this activity using Android TextView
		final TextView textView=(TextView)findViewById(R.id.textViewData);
		textView.setText(str);
	}
}
