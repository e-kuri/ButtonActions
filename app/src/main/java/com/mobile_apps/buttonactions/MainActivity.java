package com.mobile_apps.buttonactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    Button button3;
    Button button4;
    TextView tv;
    View.OnClickListener lstnr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = ((Button) findViewById(R.id.button1));
        tv = (TextView) findViewById(R.id.tv);

        lstnr = new Lstnr(tv);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tv.setText("anonimous listener");
            }
        });

        button3 = ((Button) findViewById(R.id.button3));
        button3.setOnClickListener(this);

        button4 = ((Button) findViewById(R.id.button4));
        button4.setOnClickListener(new Lstnr(tv));
    }

    public void clicked(View view) {
        tv.setText("onClick");
    }


    @Override
    public void onClick(View view) {
        tv.setText("non-anonimous listener");
    }
}
