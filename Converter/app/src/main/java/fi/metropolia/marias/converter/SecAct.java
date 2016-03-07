package fi.metropolia.marias.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecAct extends AppCompatActivity implements View.OnClickListener  {
    RadioButton SAR;
    RadioButton TAKA;
    RadioButton USD;
    Button Calc;
    double number;
    double convNum;
    String convNumString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SAR = (RadioButton) findViewById(R.id.curr1);
        TAKA = (RadioButton) findViewById(R.id.curr2);
        USD = (RadioButton) findViewById(R.id.curr3);
        Calc = (Button) findViewById(R.id.calculate);
        SAR.setOnClickListener(this);
        TAKA.setOnClickListener(this);
        USD.setOnClickListener(this);
        Calc.setOnClickListener(this);
        number = getIntent().getDoubleExtra("number",number);

    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.curr1:
                convNum = number * 4.25;
                convNumString = convNum + " SAR";
                break;

            case R.id.curr2:
                convNum = number * 85.56;
                convNumString = convNum + " TK";
                break;

            case R.id.curr3:
                convNum = number * 1.09;
                convNumString = convNum + " USD";
                break;

            case R.id.calculate:
                setContentView(R.layout.activity_main);
                TextView result = (TextView) findViewById(R.id.textView2);
                result.setText(convNumString);
        }



    }

}
