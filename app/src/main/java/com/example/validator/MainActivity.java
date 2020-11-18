package com.example.validator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.validatorlibrary.Validator;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText main_TXT_FName;
    private TextInputEditText main_TXT_LName;
    private TextInputEditText main_TXT_Email;
    private TextInputEditText main_TXT_Phone;
    private TextInputEditText main_TXT_Password;

    private TextView main_TXT_headline;
    private TextView main_TXT_pass1;
    private TextView main_TXT_pass2;
    private TextView main_TXT_pass3;
    private Button main_BTN_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          init();
        listeners();
    }

    private void init() {
        main_TXT_FName = findViewById(R.id.main_TXT_FName);
        main_TXT_LName = findViewById(R.id.main_TXT_LName);
        main_TXT_Email = findViewById(R.id.main_TXT_Email);
        main_TXT_Phone = findViewById(R.id.main_TXT_Phone);
        main_TXT_Password = findViewById(R.id.main_TXT_Password);
        main_TXT_headline = findViewById(R.id.main_TXT_headline);
        main_TXT_pass1 = findViewById(R.id.main_TXT_pass1);
        main_TXT_pass2 = findViewById(R.id.main_TXT_pass2);
        main_TXT_pass3 = findViewById(R.id.main_TXT_pass3);
        main_BTN_click = findViewById(R.id.main_BTN_click);
    }

    private void listeners() {
        main_BTN_click.setOnClickListener(v -> {
            registerUser();
        });
    }

    private void toast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    private void registerUser() {
        if(!validateName(main_TXT_FName.getText().toString())){
            toast("Check your First name");
        }
        else if(!validateName(main_TXT_LName.getText().toString()))
            toast("Check your Last name");
        else if(!validateEmail(main_TXT_Email.getText().toString()))
            toast("Check your Email");
        else if(!validatePhone(main_TXT_Phone.getText().toString()))
            toast("Check your Phone");
        else if(!validatePassword(main_TXT_Password.getText().toString()))
            toast("Check your Password");
        else{
            toast("Register User is success");
        }
    }

    private boolean validateName(String name) {
        return Validator.validateName(name);
    }

    private boolean validateEmail(String email) { return Validator.validateEmail(email); }

    private boolean validatePhone(String phone) {
        return Validator.validatePhone(phone);
    }

    private boolean validatePassword(String password) {
        return Validator.validatePassword(password);
    }
}