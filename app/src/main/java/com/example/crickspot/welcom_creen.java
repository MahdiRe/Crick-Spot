package com.example.crickspot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class welcom_creen extends AppCompatActivity implements View.OnClickListener{

    private EditText name;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_creen);

        Button signin = (Button)findViewById(R.id.signin);
        signin.setOnClickListener(this);

        Button scroll = (Button)findViewById(R.id.about_us);
        scroll.setOnClickListener(this);

        name = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);

        Button loginBtn = (Button)findViewById(R.id.login);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signin:
                OpenCreateScreen();
                break;
            case R.id.about_us:
                OpenAboutScreen();
                break;
            case R.id.login:
                validate(name.getText().toString(),Password.getText().toString());
                OpenUserScreen();
                
                break;
        }
    }

    private void validate(String name, String pass) {
        if((name.equals("Nishanth")) && (pass.equals("1234"))){
           OpenUserScreen();
        }

    }

    private void OpenUserScreen() {
        Intent intent = new Intent(this,UserScreen.class);
        startActivity(intent);
    }


    private void OpenAboutScreen() {
        Intent intent = new Intent(this,ScrollActivity.class);
        startActivity(intent);
    }

    //Account Create Operater
    private void OpenCreateScreen() {
        Intent intent = new Intent(this,CreateAccount.class);
        startActivity(intent);
    }
}
