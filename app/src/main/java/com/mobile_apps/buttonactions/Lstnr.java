package com.mobile_apps.buttonactions;

import android.view.View;
import android.widget.TextView;


/**
 * Created by admin on 6/30/2016.
 */
public class Lstnr implements View.OnClickListener {

    TextView tv;

    public Lstnr(View view){
        if(view instanceof TextView)
            tv = (TextView) view;
    }

    @Override
    public void onClick(View view) {
        tv.setText("external class listener");
    }

     new MainActivity.B();
}
