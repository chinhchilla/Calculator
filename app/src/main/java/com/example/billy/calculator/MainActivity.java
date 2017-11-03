package com.example.billy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot, btnC, btndiv, btnmult, btnsub, btnadd, btnequal;
    private EditText editText;
    private String value, value2;
    private int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndot = (Button) findViewById(R.id.btndot);
        btnC = (Button) findViewById(R.id.btnC);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmult = (Button) findViewById(R.id.btnmult);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnequal = (Button) findViewById(R.id.btnequal);
        editText = (EditText) findViewById(R.id.editText);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append("9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.append(".");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = editText.getText().toString();
                operation = 1;
                editText.setText("");
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = editText.getText().toString();
                operation = 2;
                editText.setText("");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = editText.getText().toString();
                operation = 3;
                editText.setText("");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = editText.getText().toString();
                operation = 4;
                editText.setText("");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = editText.getText().toString();
                if (operation == 1)
                {
                    editText.setText(String.valueOf(Double.parseDouble(value)/Double.parseDouble(value2)));
                }
                if (operation == 2)
                {
                    editText.setText(String.valueOf(Double.parseDouble(value)*Double.parseDouble(value2)));
                }
                if (operation == 3)
                {
                    editText.setText(String.valueOf(Double.parseDouble(value)-Double.parseDouble(value2)));
                }
                if (operation == 4)
                {
                    editText.setText(String.valueOf(Double.parseDouble(value)+Double.parseDouble(value2)));
                }
            }
        });


    }
}
