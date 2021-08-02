package com.example.premed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



 /*login button NExt Page*/
        val login: Button=findViewById(R.id.b1)
        login.setOnClickListener{
        val intent=Intent(this,Login::class.java)
        startActivity(intent)
        }
            /*signup button next page*/
            val sign:Button=findViewById(R.id.b2)
            sign.setOnClickListener{
                val intent=Intent(this,signup::class.java)
                startActivity(intent)

            }




    }


}