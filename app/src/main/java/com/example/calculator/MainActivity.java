package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView Number1;
        TextView  Number2;
        TextView Answer ;
        Double Num1;
        Double Num2;
        Double Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1 = findViewById(R.id.numone);
        Number2 = findViewById(R.id.numtwo);
        Answer =findViewById(R.id.Ans);



    }



    public void Adition(View v){

        Num1 = Double.parseDouble(Number1.getText().toString());
        Num2 = Double.parseDouble(Number2.getText().toString());

        Ans =Num1 + Num2;

        Answer.setText(Ans.toString());

    }

    public void Multi(View v){

       Num1 = Double.parseDouble(Number1.getText().toString());
        Num2 = Double.parseDouble(Number2.getText().toString());

        Ans =Num1 * Num2;

        Answer.setText(Ans.toString());

    }

    public void divide(View v){

        Num1 = Double.parseDouble(Number1.getText().toString());
        Num2 = Double.parseDouble(Number2.getText().toString());

        Ans =Num1 / Num2;

        Answer.setText(Ans.toString());

    }

    public void Subs(View v){

        Num1 = Double.parseDouble(Number1.getText().toString());
        Num2 = Double.parseDouble(Number2.getText().toString());

        Ans =Num1 - Num2;

        Answer.setText(Ans.toString());

    }

}
