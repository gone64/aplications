package com.example.nika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var sgn : TextView
    lateinit var sgn1 : TextView
    lateinit var sgnn : TextView
    lateinit var mail : EditText
    lateinit var psw : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sgn = findViewById(R.id.textView)
        sgn1 = findViewById(R.id.textView2)
        sgnn = findViewById(R.id.sgnpn)
        mail = findViewById(R.id.editText)
        psw = findViewById(R.id.pswrd)
        sgn1.setOnClickListener {
            if(mail.text.toString().isEmpty() or psw.text.toString().isEmpty()){
                Toast.makeText(this, "შეავსეთ ველი!", Toast.LENGTH_SHORT).show()
            }
            else{
                sgn.setTextColor(getColor(R.color.purple_200))
            }
        }
        sgnn.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}