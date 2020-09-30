package com.example.androidninjav2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit__profile.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes

class Edit_Profile : AppCompatActivity() {
    var gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit__profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        radio_group.setOnCheckedChangeListener { group, checkedID ->
            if (checkedID == R.id.radio_male) {
                gender = radio_male.text.toString()
            }
            if (checkedID == R.id.radio_female) {
                gender = radio_female.text.toString()
            }
        }
        btn_signup.setOnClickListener() {
            val name = et_name.text.toString()
            val age = et_age.text.toString()
            val phone = et_phone.text.toString()
            val email = et_mail.text.toString()
            val height = et_height.text.toString()
            val weight = et_weight.text.toString()

            if (name.trim().isEmpty()&& age.trim().length > 0 && phone.trim().length > 0 &&
                    email.trim().length > 0 && height.trim().length > 0 && weight.trim().length > 0) {
                val intent = Intent(this, profile::class.java)

                intent.putExtra("user_name", name)
                intent.putExtra("user_age", age)
                intent.putExtra("user_phone", phone)
                intent.putExtra("user_email", email)
                intent.putExtra("user_height", height)
                intent.putExtra("user_weight", weight)
                intent.putExtra("user_gender", gender)
                startActivity(intent)

            } else {
                Toast.makeText(this, "fill all the field", Toast.LENGTH_SHORT).show()
            }
        }
    }

}





