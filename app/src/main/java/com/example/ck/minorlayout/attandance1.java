package com.example.ck.minorlayout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class attandance1 extends Activity {

    Button cs,ec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attandance1);
        cs = (Button) findViewById(R.id.sub1);
        ec= (Button) findViewById(R.id.ec);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(attandance1.this,attandance2.class));
            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(attandance1.this,attandance2.class));
            }
        });
    }
}
