package com.example.app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mGetDialog = (Button) findViewById(R.id.btnGetDialog);
        mGetDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);
                final EditText mEmail = (EditText) mView.findViewById(R.id.etEmail);
                final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                Button mLogin = (Button) mView.findViewById(R.id.btnLogin);

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!mEmail.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this,
                                    "Login successful",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this,
                                    "Please Enter Email or Password",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }
}
