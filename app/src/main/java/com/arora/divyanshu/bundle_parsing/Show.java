package com.arora.divyanshu.bundle_parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Show extends AppCompatActivity {


    TextView name,email,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        name=(TextView)findViewById(R.id.nameShow);
        email=(TextView)findViewById(R.id.email_show);
        add=(TextView) findViewById(R.id.addshow);


        name.setText(getIntent().getExtras().getString("name"));
        email.setText(getIntent().getExtras().getString("email"));
        add.setText(getIntent().getExtras().getString("address"));

    }
}

