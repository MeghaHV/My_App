package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.codingee.splashscreenkotlin.R

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val createAccount: Button = findViewById(R.id.create_an_account)
        val titleText: TextView = findViewById(R.id.create_an_account)
    }
    fun callCreateAccount(view: View){

    }
}