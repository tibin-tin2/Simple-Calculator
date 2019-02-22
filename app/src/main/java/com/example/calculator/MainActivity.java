package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView disp, num1, num2, opt;
    Button correct;
    public long ip, op, a, b, f1, f2, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }





    public void one (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 1;

        disp.setText(String.valueOf(op));

    }

    public void two (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 2;

        disp.setText(String.valueOf(op));

    }

    public void three (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 3;

        disp.setText(String.valueOf(op));

    }

    public void four (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 4;

        disp.setText(String.valueOf(op));

    }

    public void five (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 5;

        disp.setText(String.valueOf(op));

    }

    public void six (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 6;

        disp.setText(String.valueOf(op));

    }

    public void seven (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 7;

        disp.setText(String.valueOf(op));

    }

    public void eight (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 8;

        disp.setText(String.valueOf(op));

    }

    public void nine (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 9;

        disp.setText(String.valueOf(op));

    }

    public void zero (View view)
    {
        disp = (TextView) findViewById(R.id.display);

        ip = Integer.parseInt(disp.getText().toString());

        op = (ip * 10) + 0;

        disp.setText(String.valueOf(op));

    }

    public void correct (View view)
    {
        //method to delete disgit one by one in display

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);
        correct = (Button) findViewById(R.id.correct);
        ip = Integer.parseInt(disp.getText().toString());

        long mo = ip % 10;

        if (mo == 0)
        {
            op = ip / 10;
        }
        else
        {
            op = (ip - mo) / 10;
        }

        disp.setText(String.valueOf(op));
        num1.setText("");
        num2.setText("");
        opt.setText("");


        //method to long click to the button

        correct.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v) {

                disp.setText("0");
                num1.setText("");
                num2.setText("");
                opt.setText("");

                a = b = f1 = f2 = p = ip = op = 0;

                return true;
            }
        });




    }


    public void division (View view)
    {

        //method for addtion

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);

        if ( f2 == 0 && p == 0 )
        {

            a = Integer.parseInt(disp.getText().toString());

            num1.setText(String.valueOf(a));
            num2.setText("");
            opt.setText("/");
            disp.setText("0");

            f1 = 1;
            p = 1;


        }
        else
        {
            a = Integer.parseInt(num1.getText().toString());
            b = Integer.parseInt(disp.getText().toString());

            if (p == 1)
            {
                op = a / b;
            }
            else if (p == 2)
            {
                op = a * b;
            }
            else if (p == 3)
            {
                op = a - b;
            }
            else if (p == 4)
            {
                op = a + b;
            }

            num1.setText(String.valueOf(op));
            opt.setText("/");
            num2.setText("");
            disp.setText("0");

            p = 1;
            a = op;

        }

    }

    public void multiplicaton (View view)
    {

        //method for addtion

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);

        if ( f2 == 0 && p == 0 )
        {

            a = Integer.parseInt(disp.getText().toString());

            num1.setText(String.valueOf(a));
            num2.setText("");
            opt.setText("*");
            disp.setText("0");

            f1 = 1;
            p = 2;


        }
        else
        {
            a = Integer.parseInt(num1.getText().toString());
            b = Integer.parseInt(disp.getText().toString());

            if (p == 1)
            {
                op = a / b;
            }
            else if (p == 2)
            {
                op = a * b;
            }
            else if (p == 3)
            {
                op = a - b;
            }
            else if (p == 4)
            {
                op = a + b;
            }

            num1.setText(String.valueOf(op));
            opt.setText("*");
            num2.setText("");
            disp.setText("0");

            p = 2;
            a = op;

        }

    }

    public void substration (View view)
    {

        //method for addtion

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);

        if ( f2 == 0 && p == 0 )
        {

            a = Integer.parseInt(disp.getText().toString());

            num1.setText(String.valueOf(a));
            num2.setText("");
            opt.setText("-");
            disp.setText("0");

            f1 = 1;
            p = 3;


        }
        else
        {
            a = Integer.parseInt(num1.getText().toString());
            b = Integer.parseInt(disp.getText().toString());

            if (p == 1)
            {
                op = a / b;
            }
            else if (p == 2)
            {
                op = a * b;
            }
            else if (p == 3)
            {
                op = a - b;
            }
            else if (p == 4)
            {
                op = a + b;
            }

            num1.setText(String.valueOf(op));
            opt.setText("-");
            num2.setText("");
            disp.setText("0");

            p = 3;
            a = op;

        }

    }








    public void addition (View view)
    {

        //method for addtion

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);

        if ( f2 == 0 && p == 0 )
        {

            a = Integer.parseInt(disp.getText().toString());

            num1.setText(String.valueOf(a));
            num2.setText("");
            opt.setText("+");
            disp.setText("0");

            f1 = 1;
            p = 4;


        }
        else
        {
            a = Integer.parseInt(num1.getText().toString());
            b = Integer.parseInt(disp.getText().toString());

            if (p == 1)
            {
                op = a / b;
            }
            else if (p == 2)
            {
                op = a * b;
            }
            else if (p == 3)
            {
                op = a - b;
            }
            else if (p == 4)
            {
                op = a + b;
            }

            num1.setText(String.valueOf(op));
            opt.setText("+");
            num2.setText("");
            disp.setText("0");

            p = 4;
            a = op;

        }

    }

    public void equal (View view) {

        disp = (TextView) findViewById(R.id.display);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        opt = (TextView) findViewById(R.id.opt);

        b = Integer.parseInt(disp.getText().toString());

        if (p == 1)
        {
            op = a / b;
        }
        else if (p == 2)
        {
            op = a * b;
        }
        else if (p == 3)
        {
            op = a - b;
        }
        else if (p == 4)
        {
            op = a + b;
        }

        num2.setText(String.valueOf(b));
        disp.setText(String.valueOf(op));

        a = op;
        f1 = 1;
        b = f2 = p = 0;



    }


}
