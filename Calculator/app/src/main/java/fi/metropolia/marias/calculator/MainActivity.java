package fi.metropolia.marias.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button divide;
    Button multiply;
    Button add;
    Button minus;
    Button equals;
    Button c;
    TextView display;
    // Represent whether the lastly pressed key is numeric or not
    private boolean lastNumeric;
    // Represent that current state is in error or not
    private boolean stateError;
    // If true, do not allow to add another DOT
    private boolean lastDot;
    //List of all numeric buttons
    Button[] numericButtons;
    //List of all operand buttons
    Button[] operandButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        multiply = (Button) findViewById(R.id.multiply);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        c = (Button) findViewById(R.id.c);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        c.setOnClickListener(this);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        display = (TextView) findViewById(R.id.display);
        display.setText("");
    }

   public void onClick(View v) {
        switch(v.getId()){
            case R.id.one:
                display.append("1");
                break;

            case R.id.two:
                display.append("2");
                break;

            case R.id.three:
                display.append("3");
                break;

            case R.id.four:
                display.append("4");
                break;

            case R.id.five:
                display.append("5");
                break;

            case R.id.six:
                display.append("6");
                break;

            case R.id.seven:
                display.append("7");
                break;

            case R.id.eight:
                display.append("8");
                break;

            case R.id.nine:
                display.append("9");
                break;

            case R.id.zero:
                display.append("0");
                break;

            case R.id.add:
                display.append("+");
                break;
        }
        }


}

