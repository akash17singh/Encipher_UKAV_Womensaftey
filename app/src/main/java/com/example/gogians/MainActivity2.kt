package com.example.gogians

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    lateinit var etMobileNumber:EditText
    lateinit var etTextPassword:EditText
    lateinit var btnButton:Button
    lateinit var txtForgotPassword:TextView
    lateinit var txtRegisterYourself:TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title="Women safety"

        etMobileNumber=findViewById(R.id.etMobileNumber)
        etTextPassword=findViewById(R.id.etTextPassword)
        btnButton=findViewById(R.id.btnButton)
        txtRegisterYourself=findViewById(R.id.textRegisterYourself)
        txtForgotPassword=findViewById(R.id.textForgotPassword)

        btnButton.setOnClickListener {
            Toast.makeText(this@MainActivity2,
                    " ",
                    Toast.LENGTH_LONG
            ).show()

            val intent=Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)

        }
    }
}