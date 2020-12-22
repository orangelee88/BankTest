package com.example.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TakeMoney extends AppCompatActivity {
    int a = 100000;
    EditText m;                //宣告全域變數,// 輸入者結果
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_take_money );
        m = (EditText) findViewById( R.id.InputMoney );     // 取得輸入者金額
        Button button1 = findViewById( R.id.btn1 );
        button1.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                TextView addText = findViewById( R.id.InputMoney );/** 把值-500元*/
                a = a - 500; /**金額-500動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button2 = findViewById( R.id.btn2 );
        button2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值-1000元*/
                a = a - 1000; /**金額-1000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢1000元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button3 = findViewById( R.id.btn3 );
        button3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值-2000元*/
                a = a - 2000; /**金額-2000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢2000元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button4 = findViewById( R.id.btn4 );
        button4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值-5000元*/
                a = a - 5000; /**金額-5000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢5000元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button5 = findViewById( R.id.btn5 );
        button5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值-10000元*/
                a = a - 10000; /**金額-10000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢10000元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button6 = findViewById( R.id.btn6 );
        button6.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值-50000元*/
                a = a - 50000; /**金額-50000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( TakeMoney.this, "提錢50000元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button7 = findViewById( R.id.btn7 );/**點擊確認按鈕*/
        button7.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                SharedPreferences save = getSharedPreferences( "TakeMoney", MODE_PRIVATE );
                save.edit().putString( "money", m.getText().toString() )
                        .apply();

                Intent intent = new Intent();
                intent.setClass( TakeMoney.this, CheckBalances.class );
                Bundle bundle = new Bundle(); /**new一個Bundle物件，並將要傳遞的資料傳入*/
                bundle.putString( "sum", m.getText().toString() );
                intent.putExtras( bundle );   // 記得put進去，不然資料不會帶過去
                Toast.makeText( TakeMoney.this, "顯示存款金額", Toast.LENGTH_SHORT ).show();
                /**啟用意圖*/
                startActivity( intent );
            }
        } );
    }
}