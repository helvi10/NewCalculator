package com.example.helvi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal,bclr;
    EditText et;
    int val1,val2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1= (Button) findViewById(R.id.button01);
        b2= (Button) findViewById(R.id.button02);
        b3= (Button) findViewById(R.id.button03);
        b4= (Button) findViewById(R.id.button04);
        b5= (Button) findViewById(R.id.button05);
        b6= (Button) findViewById(R.id.button06);
        b7= (Button) findViewById(R.id.button07);
        b8= (Button) findViewById(R.id.button08);
        b9= (Button) findViewById(R.id.button09);
        b0= (Button) findViewById(R.id.button00);
        badd= (Button) findViewById(R.id.buttonAdd);
        bsub= (Button) findViewById(R.id.buttonSub);
        bmul= (Button) findViewById(R.id.buttonMul);
        bdiv= (Button) findViewById(R.id.buttonDiv);
        bdot= (Button) findViewById(R.id.buttonDot);
        bequal= (Button) findViewById(R.id.buttonClr);
        bclr= (Button) findViewById(R.id.buttonCLR);
        et= (EditText) findViewById(R.id.editTextDisplay);


        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(null);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et.setText(et.getText()+"1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               et.setText(et.getText()+"4");
           }
       });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Integer.parseInt(et.getText()+"");
                sub=true;
                et.setText(null);


            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Integer.parseInt(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1=Integer.parseInt(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Integer.parseInt(et.getText() + "");

                if (add == true) {
                    et.setText(val1 + val2 + "");
                    add = false;
                }
                if (sub == true) {
                    et.setText(val1 - val2 + "");
                    sub = false;
                }
                if (mul == true) {
                    et.setText(val1 * val2+"");
                    mul = false;
                }
                if (div == true) {
                    et.setText(val1 / val2 + "");
                    div = false;

                }
            }
        });

    }
}



