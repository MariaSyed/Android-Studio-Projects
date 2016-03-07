package fi.metropolia.marias.monthgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button jan;
    Button feb;
    Button mar;
    Button april;
    Button may;
    Button jun;
    Button jul;
    Button aug;
    Button sep;
    Button oct;
    Button nov;
    Button dec;
    EditText result;
    int userNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jan = (Button) findViewById(R.id.jan);
        feb = (Button) findViewById(R.id.feb);
        mar = (Button) findViewById(R.id.mar);
        april = (Button) findViewById(R.id.april);
        may = (Button) findViewById(R.id.may);
        jun = (Button) findViewById(R.id.jun);
        jul = (Button) findViewById(R.id.jul);
        aug = (Button) findViewById(R.id.aug);
        sep = (Button) findViewById(R.id.sep);
        oct = (Button) findViewById(R.id.oct);
        nov = (Button) findViewById(R.id.nov);
        dec = (Button) findViewById(R.id.dec);
        result = (EditText) findViewById(R.id.result);
        jan.setOnClickListener(this);
        feb.setOnClickListener(this);
        mar.setOnClickListener(this);
        april.setOnClickListener(this);
        may.setOnClickListener(this);
        jun.setOnClickListener(this);
        jul.setOnClickListener(this);
        aug.setOnClickListener(this);
        sep.setOnClickListener(this);
        oct.setOnClickListener(this);
        nov.setOnClickListener(this);
        dec.setOnClickListener(this);

    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.jan:
                userNum = 0;
                break;

            case R.id.feb:
                userNum = 1;
                break;

            case R.id.mar:
                userNum = 2;
                break;

            case R.id.april:
                userNum = 3;
                break;

            case R.id.may:
                userNum = 4;
                break;

            case R.id.jun:
                userNum = 5;
                break;

            case R.id.jul:
                userNum = 6;
                break;

            case R.id.aug:
                userNum = 7;
                break;

            case R.id.sep:
                userNum = 8;
                break;

            case R.id.oct:
                userNum = 9;
                break;

            case R.id.nov:
                userNum = 10;
                break;

            case R.id.dec:
                userNum = 11;
                break;

        }

        Random rand = new Random();
        int n = rand.nextInt(11);

        if(userNum == n){
            result.setText("You Won!");
        }

        else{
            result.setText("Loserrr!!");
        }
    }
}
