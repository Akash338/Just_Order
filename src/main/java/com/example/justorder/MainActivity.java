package com.example.justorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView welcomeText;
    private EditText id;
    private EditText password;
    private Button logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = (TextView) findViewById(R.id.welcomeText);
        id = (EditText)findViewById(R.id.userID);
        password = (EditText) findViewById(R.id.userPassword);
        logIn= (Button) findViewById(R.id.logInButton);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(id.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String user, String password)
    {

        if((user == "Admin" )&&(password == "Password") )
        {
            Intent intent = new Intent(MainActivity.this, CreateProfile.class);
            startActivity(intent);
        }

    }
}