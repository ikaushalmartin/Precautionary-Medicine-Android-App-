package com.example.premed

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDBHelper(context: Context):SQLiteOpenHelper(context, "USERDB",null, 1){
    @SuppressLint("SQLiteString")
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE USERS(USERID INTEGER PRIMARY KEY AUTOINCREMENT, UNAME TEXT, PWD TEXT)")
        db?.execSQL("INSERT INTO USERS(UNAME,PWD) VALUES('kaushalmartin','martin123')")
        db?.execSQL("INSERT INTO USERS(UNAME,PWD) VALUES('admin','1234')")

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}