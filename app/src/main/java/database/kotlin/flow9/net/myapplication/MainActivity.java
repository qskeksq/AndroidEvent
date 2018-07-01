package database.kotlin.flow9.net.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    // 1. xml에 설정하기
    public void welches(View view) {
        Toast.makeText(this, "웰치스 클릭", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button = findViewById(R.id.button2);
        button = findViewById(R.id.button3);
        button = findViewById(R.id.button4);


        // 2. 익명 함수 설정해주기
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 유저정보, 과금정보
                Toast.makeText(MainActivity.this, "클릭", Toast.LENGTH_LONG).show();
                // 로그이벤트 찍기
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 유저정보, 과금정보
                Toast.makeText(MainActivity.this, "클릭", Toast.LENGTH_LONG).show();
                // 로그이벤트 찍기
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 유저정보, 과금정보
                Toast.makeText(MainActivity.this, "클릭", Toast.LENGTH_LONG).show();
                // 로그이벤트 찍기
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 유저정보, 과금정보
                Toast.makeText(MainActivity.this, "클릭", Toast.LENGTH_LONG).show();
                // 로그이벤트 찍기
            }
        });

        // 3. 익명 함수 외부 설정
        button.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);

        // 4. 외부 클래스로 작성하기
        ClickClass cl = new ClickClass();
        button.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 유저정보, 과금정보
            switch (v.getId()) {
                case R.id.button1:
                    Toast.makeText(MainActivity.this, "button1 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button2:
                    Toast.makeText(MainActivity.this, "button2 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button3:
                    Toast.makeText(MainActivity.this, "button3 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button4:
                    Toast.makeText(MainActivity.this, "button4 클릭", Toast.LENGTH_LONG).show();
                    break;
            }
            // 로그이벤트 찍기
        }
    };

    // 5. 현재 클래스에 View.OnClickListener 설정
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(MainActivity.this, "button1 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "button2 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "button3 클릭", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(MainActivity.this, "button4 클릭", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
