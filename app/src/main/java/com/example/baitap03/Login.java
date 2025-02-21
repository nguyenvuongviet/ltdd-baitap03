package com.example.baitap03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private ImageButton btnLogin;
    private LinearLayout btnFacebook, btnGoogle;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Ánh xạ View từ XML
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnGoogle = findViewById(R.id.btnGoogle);
        tvRegister = findViewById(R.id.tvRegister);

        // Xử lý sự kiện nút đăng nhập
        btnLogin.setOnClickListener(view -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(Login.this, "Vui lòng nhập email và mật khẩu!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Login.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                // Thêm logic đăng nhập ở đây
            }
        });

//         Xử lý sự kiện khi nhấn vào "Register"
        tvRegister.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this, Signup.class);
            startActivity(intent);
        });

        // Xử lý sự kiện khi nhấn vào Facebook / Google
        btnFacebook.setOnClickListener(view ->
                Toast.makeText(Login.this, "Đăng nhập bằng Facebook", Toast.LENGTH_SHORT).show()
        );

        btnGoogle.setOnClickListener(view ->
                Toast.makeText(Login.this, "Đăng nhập bằng Google", Toast.LENGTH_SHORT).show()
        );
    }
}
