package com.krishna.sharedpreferencesingletone;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView mTxtViewFirst, mTxtViewLast, mTxtViewEmail;
    Button mBtnLogout;

    SharedPreference sharedPreference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sharedPreference = new SharedPreference(this);

        mTxtViewFirst = findViewById(R.id.txtFirst);
        mTxtViewLast = findViewById(R.id.txtLast);
        mTxtViewEmail = findViewById(R.id.txtEmail);

        mTxtViewFirst.setText(sharedPreference.getFirstName());
        mTxtViewLast.setText(sharedPreference.getLastName());
        mTxtViewEmail.setText(sharedPreference.getEmail());

        mBtnLogout = findViewById(R.id.btnLogout);

        mBtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreference.setIsLogin(false);
                finish();
            }
        });
    }
}