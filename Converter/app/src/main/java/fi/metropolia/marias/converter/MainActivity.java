package fi.metropolia.marias.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button convert;
    EditText txtbox;
    TextView result;
    double number;
    double convNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button) findViewById(R.id.convert);
        txtbox = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.textView2);
        convert.setOnClickListener(this);
        txtbox.setOnClickListener(this);
    }

    public void onClick(View v){
        number = Double.parseDouble(txtbox.getText().toString());
        Intent MyIntent = new Intent(this,SecAct.class);
        MyIntent.putExtra("number", number);
        startActivityForResult(MyIntent, 123);
    }

}
