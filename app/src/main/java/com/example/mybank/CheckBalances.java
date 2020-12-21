package com.example.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBalances extends AppCompatActivity {
    int a = 100000;
    /**初始值　100000元*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_check_balances );
        Bundle bundle = getIntent().getExtras();/**取得傳遞過來的資料*/
        if(bundle != null){
            String a = bundle.getString( "sum" );
            TextView result = findViewById( R.id.tv5 );/**取得 顯示金額*/
            result.setText( a );
        }
        Button button1 = findViewById( R.id.btn1 );  /**返回按鈕*/
        button1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText( CheckBalances.this, "回主頁面", Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent( CheckBalances.this, MainActivity.class );/** 返回主頁*/
                startActivity( intent );

            }
        } );

    }
}