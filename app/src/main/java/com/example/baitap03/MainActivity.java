package com.example.baitap03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Mảng chứa danh sách các hình nền
    private final int[] backgrounds = {R.drawable.bg1, R.drawable.bg2, R.drawable.bg3};
    private final Random random = new Random(); // Đối tượng random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm View của layout chính
        View mainLayout = findViewById(R.id.mainLayout);

        // Tự động thay đổi hình nền khi mở app
        int randomIndex = random.nextInt(backgrounds.length);
        mainLayout.setBackgroundResource(backgrounds[randomIndex]);

        // Lấy Button đổi hình nền
        Button switchBackground = findViewById(R.id.switchBackground);
        switchBackground.setOnClickListener(v -> {
            int newBackground = backgrounds[random.nextInt(backgrounds.length)];
            mainLayout.setBackgroundResource(newBackground);
        });

        // Lấy Button để chuyển màn hình
        Button btnGoToLinearLayout = findViewById(R.id.btnGoToLinearLayout);
        btnGoToLinearLayout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        // Lấy Button để chuyển màn hình sang Login
        Button btnGoToLogin = findViewById(R.id.loginButton);
        btnGoToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

    }
}
