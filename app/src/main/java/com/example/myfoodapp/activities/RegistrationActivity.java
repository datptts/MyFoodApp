package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfoodapp.MainActivity;
import com.example.myfoodapp.R;
import com.example.myfoodapp.database.DatabaseHelper;
import com.example.myfoodapp.databinding.ActivityRegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {

    ActivityRegistrationBinding bingding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bingding = ActivityRegistrationBinding.inflate(getLayoutInflater());
        setContentView(bingding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        bingding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = bingding.regisUserName.getText().toString();
                String password = bingding.regisPass.getText().toString();
                String confirmPassword = bingding.regisPassConfirm.getText().toString();

                if(username.equals("") || password.equals("") || confirmPassword.equals(""))
                    Toast.makeText(RegistrationActivity.this,"Bạn Phải Nhập Đầy Đủ UserName và Mật Khẩu", Toast.LENGTH_SHORT).show();
                else {
                    if(password.equals(confirmPassword)){
                        Boolean checkUserEmail = databaseHelper.checkUserName(username);

                        if(checkUserEmail == false){
                            Boolean insert = databaseHelper.insertData(username,password);
                            if( insert == true){
                                Toast.makeText(RegistrationActivity.this,"Đăng Ký Thành Công ", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent);
                            }else {
                                Toast.makeText(RegistrationActivity.this,"Thất Bại ", Toast.LENGTH_SHORT).show();

                            }
                        }else {
                            Toast.makeText(RegistrationActivity.this,"tên người dùng đã tồn tại, vui lòng nhập lại", Toast.LENGTH_SHORT).show();

                        }
                    }else {
                        Toast.makeText(RegistrationActivity.this,"Password Sai", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });



    }


    public void login(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }

}