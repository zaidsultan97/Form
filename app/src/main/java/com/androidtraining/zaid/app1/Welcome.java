package com.androidtraining.zaid.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent i = getIntent();
        Bundle extra = i.getExtras();
        String name = extra.getString("name");
        String msg = "Welcome " + name;
        t = (TextView) findViewById(R.id.textView_msg);
        t.setText(msg);
    }
}
