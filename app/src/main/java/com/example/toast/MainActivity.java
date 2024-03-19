package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    TextView Tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3;
    ImageView iv1,iv2,iv3;
    Button bt1,bt2,bt3,resetbt;
    Random rnd = new Random();
    int rnd1 = rnd.nextInt(90)+10;
    int rnd2 = rnd.nextInt(90)+10;
    int rnd3 = rnd.nextInt(90)+10;
    int rnd4 = rnd.nextInt(90)+10;
    int et1text,et2text,et3text;
    long counter = 0;
    int sum1 = rnd1+rnd2;
    int sum2 = sum1+rnd3;
    String str;
    int result;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv1 = findViewById(R.id.Tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        resetbt = findViewById(R.id.resetbt);
        Tv1.setText(""+rnd1);
        tv2.setText(""+sum1);
        tv3.setText(""+sum2);
        tv4.setText(""+rnd2);
        tv5.setText(""+rnd3);
        tv6.setText(""+rnd4);
    }

    public void et1clicked(View view)
    {

    }
    public void go1(View view)
    {
        String st1 = et1.getText().toString();
        if (!st1.isEmpty())
        {
            iv1.setVisibility(View.VISIBLE);
            et1text = Integer.parseInt(st1);
            if (rnd1+rnd2 == et1text)
            {
                iv1.setImageResource(R.drawable.v);
                counter++;
            }
            else
            {
                iv1.setImageResource(R.drawable.x);
            }
            tv2.setVisibility(View.VISIBLE);
            tv5.setVisibility(View.VISIBLE);
            et2.setVisibility(View.VISIBLE);
            bt2.setVisibility(View.VISIBLE);
            bt1.setEnabled(false);
        }
        else
            Toast.makeText(this,"enter your answer", Toast.LENGTH_SHORT).show();
    }




    public void go2(View view)
    {
        String st2 = et2.getText().toString();
        if (!st2.isEmpty())
        {
            iv2.setVisibility(View.VISIBLE);
            et2text = Integer.parseInt(st2);
            if (rnd1+rnd2+rnd3 == et2text)
            {
                iv2.setImageResource(R.drawable.v);
                counter++;
            }
            else
            {
                iv2.setImageResource(R.drawable.x);
            }
            tv3.setVisibility(View.VISIBLE);
            tv6.setVisibility(View.VISIBLE);
            et3.setVisibility(View.VISIBLE);
            bt3.setVisibility(View.VISIBLE);
            bt2.setEnabled(false);
        }
        else
            Toast.makeText(this,"enter your answer", Toast.LENGTH_SHORT).show();
    }

    public void go3(View view)
    {
        String st3 = et3.getText().toString();
        if (!st3.isEmpty())
        {
            iv3.setVisibility(View.VISIBLE);
            et3text = Integer.parseInt(st3);
            if(rnd1+rnd2+rnd3+rnd4 == et3text)
            {
                iv3.setImageResource(R.drawable.v);
                counter++;
            }
            else
            {
                iv3.setImageResource(R.drawable.x);
            }
            resetbt.setVisibility(View.VISIBLE);
            result = (int) Math.round(counter*33.33);
            str = String.valueOf(result) + "%, " + String.valueOf(counter) + "/3";
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
            bt3.setEnabled(false);
        }
        Toast.makeText(this,"enter your answer", Toast.LENGTH_SHORT).show();
    }

    public void rego(View view)
    {
        rnd1 = rnd.nextInt(90)+10;
        rnd2 = rnd.nextInt(90)+10;
        rnd3 = rnd.nextInt(90)+10;
        rnd4 = rnd.nextInt(90)+10;
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        et2.setVisibility(View.INVISIBLE);
        et3.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
        resetbt.setVisibility(View.INVISIBLE);
        sum1 = rnd1+rnd2;
        sum2 = sum1+rnd3;
        Tv1.setText(""+rnd1);
        tv2.setText(""+sum1);
        tv3.setText(""+sum2);
        tv4.setText(""+rnd2);
        tv5.setText(""+rnd3);
        tv6.setText(""+rnd4);
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        et1.setText("");
        et2.setText("");
        et3.setText("");
    }
}