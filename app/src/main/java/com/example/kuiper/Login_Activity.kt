package com.example.kuiper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tv_register1 = findViewById<TextView>(R.id.tv_register)

        tv_register1.setOnClickListener{
            Toast.makeText(this,"you clicked On Text  View ",Toast.LENGTH_LONG).show()
            val intent:Intent = Intent(this,Register_Activity::class.java)
            startActivity(intent)
        }

    }
}
