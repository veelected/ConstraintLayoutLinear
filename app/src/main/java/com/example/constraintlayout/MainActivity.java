package com.example.constraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et_enterName, et_lastName, et_birthDate, et_city;
    TextView tv_nameEntry, tv_lastNameEntry, tv_cityEntry, tv_birthday;
    Button btn_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_enterName = findViewById(R.id.et_enterName);
        et_lastName = findViewById(R.id.et_lastName);
        et_birthDate = findViewById(R.id.et_birthDate);
        et_city = findViewById(R.id.et_city);

        tv_nameEntry = findViewById(R.id.tv_nameEntry);
        tv_lastNameEntry = findViewById(R.id.tv_lastNameEntry);
        tv_cityEntry = findViewById(R.id.tv_cityEntry);
        tv_birthday = findViewById(R.id.tv_birthday);

        btn_apply = findViewById(R.id.btn_apply);




        btn_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_nameEntry.setText(et_enterName.getText());
                System.out.println("test");
                tv_lastNameEntry.setText(et_lastName.getText());
                System.out.println("test");
                tv_birthday.setText(et_birthDate.getText());
                System.out.println("test");
                tv_cityEntry.setText(et_city.getText());
                System.out.println("test");
            }
        });
    }
}