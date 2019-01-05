package com.example.raunak.day3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    private TextView textview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textview = findViewById(R.id.textView);
        button = findViewById(R.id.button1);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String msg = bundle.getString("message");

        textview.setText(msg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(NextActivity.this, MainActivity.class);
                intent1.putExtra("return", "This is from next activity");
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}