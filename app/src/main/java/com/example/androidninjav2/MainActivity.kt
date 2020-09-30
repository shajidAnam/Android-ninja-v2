package com.example.androidninjav2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Email="shajiddcc@gmail.com"
        val Password="123456"
        btn_login.setOnClickListener(fun(it: View) {
            val email = et_email.text.toString();
            val password = et_password.text.toString()
            if (email.trim().length > 0 && password.trim().length > 0) {
                if (email == Email && password == Password) {
                    val intent = Intent(this, Edit_Profile::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "your email or password is incorrect", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "No field can be empty", Toast.LENGTH_LONG).show()
            }
        })


    }


}