package com.yuseok.android.logintest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    Context mContext;

    EditText editEmail,editPw;
    Button btnSignin, btnSignup;
    TextView textCheck, textEmail, textPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Context사용
        mContext = this;
        // [START initialize_auth]
        mAuth = FirebaseAuth.getInstance();
        // [END initialize_auth]

        editEmail = (EditText) findViewById(R.id.editEmail);
        editPw = (EditText) findViewById(R.id.editPw);

        textCheck = (TextView) findViewById(R.id.textCheck);
        textEmail = (TextView) findViewById(R.id.textEmail);
        textPw = (TextView) findViewById(R.id.textPw);



    }
}
