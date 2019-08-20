package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtnuma,edtnumb;
    Button Sum;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnuma = (EditText) findViewById(R.id.edtNuma);
        edtnumb=(EditText)findViewById((R.id.edtNumb));
        Sum=(Button)findViewById(R.id.btnTong);
        result=(TextView)findViewById(R.id.Result);

        Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t=Integer.parseInt(edtnuma.getText().toString()) + Integer.parseInt(edtnumb.getText().toString());
                result.setText("Tổng là" +t);
            }
        });

    }
}
