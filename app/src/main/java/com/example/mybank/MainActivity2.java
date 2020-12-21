package com.example.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

        Button button1 = findViewById( R.id.btn1 );
        button1.setOnClickListener( new View.OnClickListener() {/**存錢按鈕*/
            @Override
            public void onClick(View v) {

                Toast.makeText( MainActivity2.this, "進入銀行存錢頁面", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent( MainActivity2.this, SaveMoney.class );/** 跳下一頁存錢頁面*/
                startActivity( intent );
            }
        } );

        Button button2 = findViewById( R.id.btn2 );
        button2.setOnClickListener( new View.OnClickListener() {/**查詢餘額按鈕*/
        @Override
        public void onClick(View v) {

            Toast.makeText( MainActivity2.this, "進入查詢餘額頁面", Toast.LENGTH_SHORT ).show();
            Intent intent = new Intent( MainActivity2.this,CheckBalances.class );/** 跳下一頁查詢餘額頁面*/
            startActivity( intent );
        }
        } );

        Button button3 = findViewById( R.id.btn3 );
        button3.setOnClickListener( new View.OnClickListener() {/**領錢按鈕*/
        @Override
        public void onClick(View v) {

            Toast.makeText( MainActivity2.this, "進入銀行領錢頁面", Toast.LENGTH_SHORT ).show();
            Intent intent = new Intent( MainActivity2.this,TakeMoney.class );/** 跳下一頁存錢頁面*/
            startActivity( intent );
        }
        } );

        Button button4 = findViewById( R.id.btn4 );
        button4.setOnClickListener( new View.OnClickListener() {/**返回按鈕*/
            @Override
            public void onClick(View v) {

                Toast.makeText( MainActivity2.this, "回主頁面", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent( MainActivity2.this, MainActivity.class );/** 返回主頁*/
                startActivity( intent );
                MainActivity2.this.finish();//結束目前Activity
            }
        } );
    }
}