package com.arora.divyanshu.bundle_parsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,address;

    Button sbmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        address=(EditText)findViewById(R.id.address);


        sbmt=(Button)findViewById(R.id.sbmit);
        sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name1= name.getText().toString();
                String email1= email.getText().toString();
                String add1= address.getText().toString();


                Intent sbmt = new Intent(getApplicationContext(),Show.class);
                sbmt.putExtra("name",name1);
                sbmt.putExtra("email",email1);
                sbmt.putExtra("address",add1);
                startActivity(sbmt);


            }
        });



    }
}

