package com.example.premed

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var helper=MyDBHelper(applicationContext)
        var db=helper.readableDatabase
        val login:Button=findViewById(R.id.loginbtn)


        login.setOnClickListener {
            var ul: EditText = findViewById(R.id.userlog)
            var lp: EditText = findViewById(R.id.loginpassword)
            var args = listOf<String>(ul.text.toString(), lp.text.toString()).toTypedArray()
            var rs = db.rawQuery("SELECT * FROM USERS WHERE UNAME=? AND PWD=?", args)
            if (rs.moveToNext()){
                Toast.makeText(applicationContext, "LogedIn Successfully", Toast.LENGTH_LONG).show()
                val intent=Intent(this,medicine::class.java)
            startActivity(intent)

        }
            else {
                Toast.makeText(applicationContext, "Invalid Crediantial", Toast.LENGTH_LONG).show()

            }
        }


    }
}








