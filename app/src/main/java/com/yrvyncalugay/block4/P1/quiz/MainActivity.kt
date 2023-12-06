package com.yrvyncalugay.block4.P1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etEm: EditText
    private lateinit var etPw: EditText
    private lateinit var btsu: Button
    private lateinit var mybt: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        etEm = findViewById(R.id.et_email)
        etPw = findViewById(R.id.et_password)
        mybt = findViewById(R.id.bt_login)
        btsu = findViewById(R.id.bt_su)

    }
}