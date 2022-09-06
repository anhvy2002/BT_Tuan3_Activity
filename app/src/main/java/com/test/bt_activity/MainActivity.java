package com.test.bt_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btnketqua;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText) findViewById(R.id.txtSo1);
        txt2=(EditText) findViewById(R.id.txtSo2);
        btnketqua=(Button) findViewById(R.id.btnQuaylai);
        btnketqua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent=new Intent(MainActivity.this, ChildActivity.class);
                Bundle bundle=new Bundle();
                int so1=Integer.parseInt(txt1.getText().toString());
                int so2=Integer.parseInt(txt2.getText().toString());
                bundle.putInt("so 1", so1);
                bundle.putInt("so 2", so2);
                myIntent.putExtra("MyPackage", bundle);
                startActivity(myIntent);
            }
        });
    }
}