package com.example.emailverification;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class mylogin extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button b3 = (Button) findViewById(R.id.logout);
        b3.setOnClickListener(this);



        //String s=findViewById(R.id.fpass).toString();



    }

    //if clicked on logout will go to the first page
    public void onClick(View view) {

        Button b3 = (Button) findViewById(R.id.logout);


        switch (view.getId()) {
//
            case R.id.logout:
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(mylogin.this, MainActivity.class));
                    }
                });


                break;



//                b4.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        startActivity(new Intent(mylogin.this, factivity.class));
//                    }
//                });
//                break;}
//    }
                //srajan edited this
}}}
