package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfoodapp.MainActivity;
import com.example.myfoodapp.R;
import com.example.myfoodapp.database.DatabaseHelper;
import com.example.myfoodapp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);
        binding.singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.loginUserName.getText().toString();
                String password = binding.loginPassword.getText().toString();

                if(username.equals("") || password.equals(""))
                    Toast.makeText(LoginActivity.this, "Bạn Phải Nhập Đầy Đủ UserName và Mật Khẩu", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkCredentials = databaseHelper.checkUserNamePassword(username,password);

                    if(checkCredentials == true)
                    {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(LoginActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(LoginActivity.this, "Thông Tin Không Hợp Lệ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

}