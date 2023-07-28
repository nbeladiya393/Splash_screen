package com.example.Splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Thread thread = new Thread(){


          public void run(){

              try{

                  sleep(4000);

              }catch(Exception e){
                  e.printStackTrace();

              }finally{
                  Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                  startActivity(intent);

              }

          }


        }; thread.start();
    }
}