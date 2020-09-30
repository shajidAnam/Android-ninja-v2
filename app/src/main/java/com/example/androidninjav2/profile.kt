package com.example.androidninjav2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var intent=intent
        val name= intent.getStringExtra("user_name")
        val age= intent.getStringExtra("user_age")
        val phone= intent.getStringExtra("user_phone")
        val gender= intent.getStringExtra("user_gender")
        val height= intent.getStringExtra("user_height")
        val weight= intent.getStringExtra("user_weight")
        val email= intent.getStringExtra("user_email")
        tv_profile.text=("Name: "+name+"\n\n\nAge: "+age+"\n\n\nGender: "+gender+"\n\n\nPhone: "+phone+"\n\n\nEmail: "+email+"\n\n\nHeight: "+height+" cm\n\n\nWeight: "+weight+" KG")

    }
}