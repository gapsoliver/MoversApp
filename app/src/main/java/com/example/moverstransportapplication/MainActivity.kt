package com.example.moverstransportapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mBtnLogin: Button
    lateinit var mBtnGoogle: Button
    lateinit var tBtnView3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnLogin = findViewById(R.id.mBtnEmail)
        mBtnGoogle = findViewById(R.id.mBtnGoogle)
        tBtnView3 = findViewById(R.id.tBtnVew3)

        mBtnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        mBtnGoogle.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        tBtnView3.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}