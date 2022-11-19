package com.example.poha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**   
     */
    public void bt1() {
        bt1();
    }

    /**
     * @param view 
     */
    public void bt1(View view){
        this.view = view;
        startActivity(new Intent(getApplicationContext(),SanfeAwal.class));
    }
//    
//        public void bt1(View view) {
//            startActivity(new Intent(getApplicationContext(),SanfeAwal.class));
//        }
}