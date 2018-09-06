package com.example.anyprefdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.anyprefdemo.bean.User;

import net.nashlegend.anypref.AnyPref;

public class MainActivity extends AppCompatActivity {

    private EditText userName;

    private EditText password;

    private Button login;

    private String sUserName;

    private String sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnyPref.init(this);
        initView();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sUserName = userName.getText().toString();
                sPassword = password.getText().toString();
                User user = new User();
                user.setUserName(sUserName);
                user.setPassword(sPassword);
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                AnyPref.put(user);
            }
        });
    }

    public void initView(){
        userName = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
    }

    @Override
    protected void onRestart() {
        User user = AnyPref.get(User.class,"usermessage");
        password.setText(user.getUserName());
        super.onRestart();
    }
}
