package com.example.roopanc.jde_demo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.oracle.e1.aisclient.AISClientUtilities;
import com.oracle.e1.aisclient.CapabilityException;
import com.oracle.e1.aisclient.JDERestServiceException;
import com.oracle.e1.aisclient.LoginEnvironment;
import com.oracle.e1.aisclient.LoginResponse;
import com.oracle.e1.aisclient.LogoutRequest;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String AIS_SERVER_LINK = "http://129.146.67.39:2401";
    ProgressBar progressBar;
    LoginEnvironment loginEnvironment;
    LoginResponse loginResponse;
    String username, password;
    EditText usernameET, passwordET;
    Button nextBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
        nextBT = findViewById(R.id.nextBT);

        progressBar = findViewById(R.id.progress);

        nextBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.nextBT:
                handleLoginClick();
                break;
        }
    }

    private void handleLoginClick() {
        nextBT.requestFocus();
        progressBar.setVisibility(View.VISIBLE);
        username = usernameET.getText().toString().trim();
        password = passwordET.getText().toString().trim();


        final Message message = new Message();
        final Handler handler = new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message message) {
                //Login Success if arg1 = 1
                if (message.arg1 == 1) {
                    Toast.makeText(getApplicationContext(), "Logged in as " + loginResponse.getUsername() + " on " + loginResponse.getEnvironment(), Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);
                    WorkWithAddress workWithAddress = new WorkWithAddress();
                    workWithAddress.setLoginEnvironment(loginEnvironment);
                    getSupportFragmentManager().beginTransaction().replace(android.R.id.content, workWithAddress).addToBackStack("Work With Address").commit();
                    return false;
                }
                else {
                    progressBar.setVisibility(View.INVISIBLE);
                    if (message.arg1 == 403) {
                        //Toast.makeText(getApplicationContext(), "Credentials Invalid", Toast.LENGTH_SHORT).show();
                        passwordET.requestFocus();
                        passwordET.setError("Credentials Invalid");
                    } else {
                        Toast.makeText(getApplicationContext(), "Connection not established, Try Again Later", Toast.LENGTH_SHORT).show();
                    }
                    return false;
                }
            }
        });

        //Login Call should be in background
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    loginEnvironment = new LoginEnvironment(AIS_SERVER_LINK, username, password, "Oneplus");
                    loginResponse = loginEnvironment.getLoginResponse();
                    Log.d("login", "abc"+loginResponse.getUsername()+loginResponse.isUserAuthorized());
                    message.arg1 = 1;
                    handler.sendMessage(message);
                }
                catch (CapabilityException | IOException | JDERestServiceException e) {
                    e.printStackTrace();
                    String errormsg = e.getMessage();
                    if (errormsg.contains("Incorrect User ID or Password"))
                    {
                        message.arg1 = 403;
                    }
                    Log.d("rest", e.toString());
                    handler.sendMessage(message);
                }
            }
        }).start();
    }
}
