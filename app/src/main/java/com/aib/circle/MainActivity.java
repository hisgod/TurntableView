package com.aib.circle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.aib.view.TurntableView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> texts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 8; i++) {
            texts.add(i + "");
        }

        final TurntableView tvCircle = findViewById(R.id.tv_circle);
        tvCircle.setText(texts);
        tvCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = new Random().nextInt(texts.size());
                tvCircle.startPosition(5, 5000, pos + 1);
            }
        });
    }
}
