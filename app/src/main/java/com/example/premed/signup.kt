package com.example.premed

import android.content.ContentValues
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase


class signup : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var helper=MyDBHelper(applicationContext)
        var db=helper.readableDatabase
        var rs=db.rawQuery("SELECT*FROM USERS",null)

        var register: Button = findViewById(R.id.button2)
        var usernamesign: EditText=findViewById(R.id.usersign)
        var password: EditText=findViewById(R.id.editTextTextPassword2)
        var fname: EditText=findViewById(R.id.editTextTextPersonName)
        var lname: EditText=findViewById(R.id.userlog)
       register.setOnClickListener {

           var cv=ContentValues()
           cv.put("UNAME",usernamesign.text.toString())
           cv.put("PWD",password.text.toString())

           db.insert("USERS",null,cv)
           val text = "Account created Successfully"
           val duration = Toast.LENGTH_LONG
           val toast = Toast.makeText(applicationContext, text, duration).show()

           usernamesign.setText("")
           password.setText("")
           fname.setText("")
           lname.setText("")
           fname.requestFocus()


       }
       }

        }




