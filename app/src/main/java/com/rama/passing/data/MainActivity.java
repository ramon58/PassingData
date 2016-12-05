package com.rama.passing.data;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Ramon on 05/12/2016.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartNewActiviity(View v)
    {
        //Get EditTestName Instance
        final EditText editTextName=(EditText)findViewById(R.id.editTextName);
        ///Get the string from that EditText, which we will send to a new Activity.
        String strName=editTextName.getText().toString();

        //Get the phone number
        final EditText editTextPhoneNo=(EditText)findViewById(R.id.editPhoneNumber);
        String strPhoneNo = editTextPhoneNo.getText().toString();
        //convert it into integer
        Long phoneNo=Long.parseLong(strPhoneNo);

        // create a new intent which will be used to start an activity with some data
        Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
        // put the name and phone(to be sent to other activity) in intent
        intent.putExtra("PERSON_NAME", strName);
        intent.putExtra("PHONE_NUMBER", phoneNo);
        // start the second activity
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}

