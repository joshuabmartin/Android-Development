package com.example.joshmartin.loginpasswordapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_main);
    }

    public void clickFunction(View view){
        //Toast to get a toast, makeText getAppContext and then provide content and length of display and instruct to display with show
        Toast.makeText(getApplicationContext(), "Logging in..", Toast.LENGTH_LONG).show();

        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);

       Log.i("UserName", username.getText().toString());
        Log.i("Password", password.getText().toString());

    }
}
