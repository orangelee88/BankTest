package com.example.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SaveMoney extends AppCompatActivity {
    int a = 100000;
    EditText m;                //宣告全域變數
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_save_money );

        m = (EditText)findViewById(R.id.InputMoney);     // 取得輸入者金額
        Button button1 = findViewById( R.id.btn1 );
        button1.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                TextView addText = findViewById( R.id.InputMoney );/** 把值存入500元*/
                a = a + 500; /**金額+500動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button2 = findViewById( R.id.btn2 );
        button2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值存入1000元*/
                a = a + 1000; /**金額+1000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button3 = findViewById( R.id.btn3 );
        button3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值存入2000元*/
                a = a + 1000; /**金額+2000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button4 = findViewById( R.id.btn4 );
        button4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值存入5000元*/
                a = a + 5000; /**金額+5000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button5 = findViewById( R.id.btn5 );
        button5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值存入10000元*/
                a = a + 10000; /**金額+10000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button6 = findViewById( R.id.btn6 );
        button6.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView addText = findViewById( R.id.InputMoney );/** 把值存入50000元*/
                a = a + 50000; /**金額+50000動作*/
                String s = Integer.toString( a );
                addText.setText( s );
                Toast.makeText( SaveMoney.this, "存錢500元", Toast.LENGTH_SHORT ).show();
            }
        } );

        Button button7 = findViewById( R.id.btn7 );
        button7.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                /**new一個Bundle物件，並將要傳遞的資料傳入*/
                intent.setClass(SaveMoney.this,CheckBalances.class);
                /**將Bundle物件傳給intent*/
                Bundle bundle = new Bundle();
                bundle.putString("money",m.getText().toString());

                intent.putExtras(bundle);   // 記得put進去，不然資料不會帶過去哦
                /**啟用意圖*/
                startActivity( intent );
                Toast.makeText( SaveMoney.this, "顯示存款金額", Toast.LENGTH_SHORT ).show();
                Intent Enter = new Intent( SaveMoney.this, CheckBalances.class );/**觸發確認鍵*/
                startActivity( Enter );/**跳到顯示金額頁面*/
                SaveMoney.this.finish();//結束目前Activity
            }
        } );
    }
}