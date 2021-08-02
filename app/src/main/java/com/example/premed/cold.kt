package com.example.premed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class cold : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cold)
        val back: ImageButton =findViewById(R.id.back14)
        val next: ImageButton =findViewById(R.id.next14)
        val home: ImageButton =findViewById(R.id.home14)

        back.setOnClickListener{
            val intent= Intent(this,chest::class.java)
            startActivity(intent)
        }
        home.setOnClickListener{
            val intent= Intent(this,medicine::class.java)
            startActivity(intent)
        }

        next.setOnClickListener{
            val intent= Intent(this,corona::class.java)
            startActivity(intent)
        }
    }
}