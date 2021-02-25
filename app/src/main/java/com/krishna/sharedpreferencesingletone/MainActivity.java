package com.krishna.sharedpreferencesingletone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreference sharedPreference;
    EditText mEdtFirst, mEdtLast, mEdtEmail;
    Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreference = new SharedPreference(this);

        mEdtFirst = findViewById(R.id.edtFirstName);
        mEdtLast = findViewById(R.id.edtLastName);
        mEdtEmail = findViewById(R.id.edtEmail);
        mBtnLogin = findViewById(R.id.btnLogin);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreference.setFirstName(mEdtFirst.getText().toString().trim());
                sharedPreference.setLastName(mEdtLast.getText().toString().trim());
                sharedPreference.setEmail(mEdtEmail.getText().toString().trim());
                sharedPreference.setIsLogin(true);

                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

    }


}