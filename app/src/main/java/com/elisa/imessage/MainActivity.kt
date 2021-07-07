package com.elisa.imessage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //quando clicco sul pulsante Register
        buttonRegister.setOnClickListener{
            var email=emailEditTextRegister.text.toString()
            var password=passwordEditTextRegister.text.toString()

            Log.d("Main Activity","Email is $email")
            Log.d("Main Activity","Password is $password")
        }

        //quando clicco su alredy have an account
        alreadyHaveAccountRegister.setOnClickListener{
            Log.d("Main Activity","Try to show login activity")
            var intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}