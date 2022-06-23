package com.example.shadabtextwatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button bLogin;

    // implement the TextWatcher callback listener

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            // get the content of both the edit text

            String emailInput = etEmail.getText().toString();
            String passwordInput = etPassword.getText().toString();

            // check whether both the fields are empty or not
            bLogin.setEnabled(!emailInput.isEmpty() && !passwordInput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword=(EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.loginButton);

        // set the TextChange Listener for both
        // the edit text fields

        etEmail.addTextChangedListener(textWatcher);
        etPassword.addTextChangedListener(textWatcher);


    }
}