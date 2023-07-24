package com.example.databaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val uemail=intent.getStringExtra(SignIn.KEY1)
        val uname=intent.getStringExtra(SignIn.KEY2)
        val uusername=intent.getStringExtra(SignIn.KEY3)

        val welmsg=findViewById<TextView>(R.id.name)
        val email=findViewById<TextView>(R.id.email)
        val username=findViewById<TextView>(R.id.username)

        welmsg.text= "Welcome, $uname"
        email.text="Email : $uemail"
        username.text="UserID : $uusername"
    }
}