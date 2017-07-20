package com.example.hyunji.locationweather;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    float longitude;
    float latitude;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);



        Intent weatherIntent = new Intent(MainActivity1.this, Weather.class);
//        weatherIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        weatherIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        weatherIntent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivityForResult(weatherIntent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode==1)
            {
//                Log.e("",);
            }
        }
    }


}
