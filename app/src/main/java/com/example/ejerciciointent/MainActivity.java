package com.example.ejerciciointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enviarDatos();
    }

    protected void enviarDatos(){
        Button button           = (Button) findViewById(R.id.button);
        final EditText field1   = (EditText) findViewById(R.id.field1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity2.class);

                intent.putExtra("texto", field1.getText().toString());

                startActivity(intent);
            }
        });
    }
}