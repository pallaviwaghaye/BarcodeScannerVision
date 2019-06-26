package com.webakruti.barcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textViewData;
    String barcodeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        barcodeData = getIntent().getStringExtra("barcodeData");
        textViewData = (TextView)findViewById(R.id.textViewData);
        textViewData.setText(barcodeData);

    }
}
