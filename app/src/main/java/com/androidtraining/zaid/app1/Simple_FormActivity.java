package com.androidtraining.zaid.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Simple_FormActivity extends AppCompatActivity {
    EditText et;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        et = (EditText) findViewById(R.id.editText_name);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                if (name == "" || name.trim().length() == 0 || name == null) {
                    Toast.makeText(Simple_FormActivity.this, "Kindly enter your name!", Toast.LENGTH_SHORT).show();
                } else
                    try {
                        Bundle b = new Bundle();
                        b.putString("name", name);
                        String pack = getPackageName() + ".Welcome";
                        Class cls = Class.forName(pack);
                        Intent i = new Intent(Simple_FormActivity.this, cls);
                        i.putExtras(b);
                        startActivity(i);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }

            }
        });

    }
}
