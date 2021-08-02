package com.example.premed

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class medicine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine2)
        val btnacne:ImageButton=findViewById(R.id.bacne)
        val btnasthma:ImageButton=findViewById(R.id.basthma)
        val btnallergy:ImageButton=findViewById(R.id.ballergy)
        val btnanxiety:ImageButton=findViewById(R.id.banxiety)
        val btnbp:ImageButton=findViewById(R.id.bbp)
        val btnbrain:ImageButton=findViewById(R.id.bbrain)
        val btnchest:ImageButton=findViewById(R.id.bchest)
        val btncold:ImageButton=findViewById(R.id.bcold)
        val btncorona:ImageButton=findViewById(R.id.bcorona)
        val btncough:ImageButton=findViewById(R.id.bcough)
        val btndehydration:ImageButton=findViewById(R.id.bdehydration)
        val btndiarrhea:ImageButton=findViewById(R.id.bdiarrhea)

        val btntyphoid:ImageButton=findViewById(R.id.btyphoid)
btnacne.setOnClickListener{
    val intent= Intent(this,acne::class.java)
    startActivity(intent)
}
        btnallergy.setOnClickListener{
            val intent= Intent(this,allergy::class.java)
            startActivity(intent)
        }
        btnanxiety.setOnClickListener{
            val intent= Intent(this,anxiety::class.java)
            startActivity(intent)
        }

        btnbp.setOnClickListener{
            val intent= Intent(this,bp::class.java)
            startActivity(intent)
        }
        btnasthma.setOnClickListener{
            val intent= Intent(this,asthma::class.java)
            startActivity(intent)
        }

        btnbrain.setOnClickListener{
            val intent= Intent(this,brain::class.java)
            startActivity(intent)
        }

        btnchest.setOnClickListener{
            val intent= Intent(this,chest::class.java)
            startActivity(intent)
        }

        btncold.setOnClickListener{
            val intent= Intent(this,cold::class.java)
            startActivity(intent)
        }

        btncorona.setOnClickListener{
            val intent= Intent(this,corona::class.java)
            startActivity(intent)
        }
        btncough.setOnClickListener{
            val intent= Intent(this,cough::class.java)
            startActivity(intent)
        }
        btndehydration.setOnClickListener{
            val intent= Intent(this,dehydration::class.java)
            startActivity(intent)
        }
        btndiarrhea.setOnClickListener{
            val intent= Intent(this,diarrhea::class.java)
            startActivity(intent)
        }

        btntyphoid.setOnClickListener{
            val intent= Intent(this,typhoid::class.java)
            startActivity(intent)
        }













    }
}