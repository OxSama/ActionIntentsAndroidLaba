package com.example.soumyaagarwal.myfirstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    EditText text;
    Button clickme ;
    String Texthere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        clickme = (Button)findViewById(R.id.button);
        text = (EditText)findViewById(R.id.text);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Texthere = text.getText().toString();
                Intent intent = new Intent(FirstActivity.this,
                        SecondActivity.class);
                intent.putExtra("Text",Texthere);
                startActivity(intent);
            }
        });
    }



    public void onClickBtn(View v)
    {
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }

}