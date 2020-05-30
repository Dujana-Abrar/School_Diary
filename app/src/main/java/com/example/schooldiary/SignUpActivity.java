package com.example.schooldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    private TextView textView_signin;
    private Button button_register;
    private EditText editText_nameFirst, editText_nameLast, editText_passwordregister, editText_emailregister, editText_phoneregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        textView_signin = findViewById(R.id.textView_login);
        button_register = findViewById(R.id.button_register);
        editText_emailregister = findViewById(R.id.subIdEditText_emailRegister);
        editText_passwordregister = findViewById(R.id.subIdEditText_passwordRegister);
        editText_nameLast = findViewById(R.id.subIdEditText_nameLast);
        editText_nameFirst = findViewById(R.id.subIdEditText_nameFirst);
        editText_phoneregister = findViewById(R.id.subIdEditText_phone);

        textView_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, cardviewLecture.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
