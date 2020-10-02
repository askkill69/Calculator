package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String result;
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;


    public float fNumberOne, fNumberTwo;

    boolean bAdd, bSub, bMul, bDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonMul = (Button) findViewById(R.id.btnMul);
        buttonDivision = (Button) findViewById(R.id.btnDiv);
        buttonC = (Button) findViewById(R.id.btnclear);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        //crunchifyEditText = (EditText) findViewById(R.id.edt1);
        final TextView txt = findViewById(R.id.txtshowResult);

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt.setText(txt.getText() + "1");
                    }
                });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText() + "0");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + ".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fNumberOne = Float.parseFloat(txt.getText() + "");
                bAdd = true;
                txt.setText(null);

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNumberOne = Float.parseFloat(txt.getText() + "");
                bSub = true;
                txt.setText(null);

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNumberOne = Float.parseFloat(txt.getText() + "");
                bMul = true;
                txt.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNumberOne = Float.parseFloat(txt.getText() + "");
                bDiv = true;
                txt.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fNumberTwo = Float.parseFloat(txt.getText() + "");

                if (bAdd) {
                    result = fNumberOne + fNumberTwo + "";
                    txt.setText(fNumberOne + " + " + fNumberTwo + " = " + result);
                    bAdd = false;
                }

                if (bSub) {
                    result = fNumberOne - fNumberTwo + "";
                    txt.setText(fNumberOne + " - " + fNumberTwo + " = " + result);
                    bSub = false;
                }

                if (bMul) {
                    result = fNumberOne * fNumberTwo + "";
                    txt.setText(fNumberOne + " * " + fNumberTwo + " = " + result);
                    bMul = false;
                }

                if (bDiv) {
                    result = fNumberOne / fNumberTwo + "";
                    txt.setText(fNumberOne + " / " + fNumberTwo + "=" + result);
                    bDiv = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("0");
            }
        });

    }

}
