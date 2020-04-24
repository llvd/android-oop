package com.asgar.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvInfo1, tvInfo2, tvInfo3, tvInfo4, tvInfo5;
    Vehicle v1;
    Car c1;
    Mercedes m1;
    Motorcycle moto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo1 = findViewById(R.id.textView);
        tvInfo2 = findViewById(R.id.textView2);
        tvInfo3 = findViewById(R.id.textView3);
        tvInfo4 = findViewById(R.id.textView4);

        v1 = new Vehicle("test", 25, 120, 100, 4, false);
        c1 = new Car("test car", 25, 120, 100, 4, true, "vroom");
        m1 = new Mercedes("C200", 25, 120, 100, 4, true, "vroom", "black", "yes", "blue");
        moto1 = new Motorcycle("C200", 25, 120, 100, 4, true, 3);
        tvInfo1.setText(v1.toString());
        tvInfo2.setText(c1.toString());
        tvInfo3.setText(m1.toString());
        tvInfo4.setText(moto1.toString());
        v1 = (Vehicle) m1;
        tvInfo5.setText(v1.sound() + " " + m1.goSlow());
    }
}
