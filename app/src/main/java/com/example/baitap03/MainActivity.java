package com.example.baitap03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Mảng chứa danh sách các hình nền
    private int[] backgrounds = {R.drawable.bg1, R.drawable.bg2, R.drawable.bg3};
    private Random random = new Random(); // Đối tượng random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm View của layout chính
        View mainLayout = findViewById(R.id.mainLayout);

        // Tự động thay đổi hình nền khi mở app
        int randomIndex = random.nextInt(backgrounds.length);
        mainLayout.setBackgroundResource(backgrounds[randomIndex]);

        // Lấy Button
        Button switchBackground = findViewById(R.id.switchBackground);

        // Xử lý sự kiện click để thay đổi hình nền
        switchBackground.setOnClickListener(v -> {
            int newBackground = backgrounds[random.nextInt(backgrounds.length)];
            mainLayout.setBackgroundResource(newBackground);
        });
    }
}
