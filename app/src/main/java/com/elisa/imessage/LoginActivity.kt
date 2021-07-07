package com.elisa.imessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin.setOnClickListener{
            var email=emailEditTextLogin.text.toString()
            var password=passwordEditTextLogin.text.toString()

            Log.d("Login Activity","Login with email $email and password $password")
        }
        backToRegistration.setOnClickListener{
            //Toast.makeText(this,"Not already implemented",Toast.LENGTH_LONG).show()
            //chiudiamo semplicemente l'activity per tornare alla pagina di registrazione
            finish()
        }
    }
}