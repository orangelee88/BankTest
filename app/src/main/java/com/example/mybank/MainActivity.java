package com.example.mybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String a = "123", b = "456";/** 初始值 帳號123 密碼456*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button button = findViewById( R.id.btn );
        button.setOnClickListener( new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText account = findViewById( R.id.AccountInput );/**找到自己輸入ID*/
                EditText password = findViewById( R.id.PasswordInput );
                String new_account = String.valueOf( account.getText() );/**傳換型別字串轉整數*/
                String new_password = String.valueOf( password.getText() );

                if (new_account.equals( a ) && new_password.equals( b )) {
                    Toast.makeText( MainActivity.this, "成功進入銀行頁面", Toast.LENGTH_SHORT ).show();
                    Intent intent = new Intent( MainActivity.this, MainActivity2.class );
                    startActivity(intent);
                } else {
                    Toast.makeText( MainActivity.this, "輸入錯誤，請重新輸入", Toast.LENGTH_SHORT ).show();
                }

            }
        } );
    }
}