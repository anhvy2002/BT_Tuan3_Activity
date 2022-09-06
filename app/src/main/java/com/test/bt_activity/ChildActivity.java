package com.test.bt_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ChildActivity extends AppCompatActivity {
    TextView txtketqua;
    Button btnBack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBack=(Button) findViewById(R.id.btnQuaylai);
        txtketqua=(TextView) findViewById(R.id.txtKetQua);
        Intent callerIntent=getIntent();
        Bundle packageFromCaller=
                callerIntent.getBundleExtra("MyPackage");
        int so1=packageFromCaller.getInt("so 1");
        int so2=packageFromCaller.getInt("so 2");
        TinhTong(so1, so2);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void TinhTong(int a, int b)
    {
        String kq= "";
        DecimalFormat dcf=new DecimalFormat("0.##");
        kq=dcf.format(a+b);
        txtketqua.setText(kq);
    }
}