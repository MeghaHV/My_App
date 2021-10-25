package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.codingee.splashscreenkotlin.R

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val createAccount: Button = findViewById(R.id.login_button)
        val titleText: TextView = findViewById(R.id.login_button)
    }
    fun callLoginScreen(view: View){

    }
}