package com.example.nika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var crtacc : TextView
    lateinit var mail : EditText
    lateinit var pass : EditText
    lateinit var rpass : EditText
    lateinit var sgnup : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        crtacc = findViewById(R.id.textView3)
        mail = findViewById(R.id.editText2)
        pass = findViewById(R.id.editText3)
        rpass = findViewById(R.id.editText4)
        sgnup = findViewById(R.id.SignUp)

        sgnup.setOnClickListener {
            if(mail.text.toString().isEmpty()){
            Toast.makeText(this, "შეიყვანეთ მეილი", Toast.LENGTH_SHORT).show()
            }
            else if (pass.text.toString().isEmpty() or rpass.text.toString().isEmpty()){
            Toast.makeText(this, "შეიყვანეთ პაროლი!", Toast.LENGTH_SHORT).show()
            }
            else if(pass.text.toString() != rpass.text.toString()){
                Toast.makeText(this, "პაროლები არ ემთხვევა!", Toast.LENGTH_SHORT).show()
            }
            else if((mail.text.toString().isNotEmpty()) && (pass.text.toString().isNotEmpty().equals(rpass.text.toString().isNotEmpty()))){
                    Toast.makeText(this, "წარმატებით დარეგისტრირდით!", Toast.LENGTH_SHORT).show()
                crtacc.setTextColor(getColor(R.color.purple_700))
            }

            else if (pass.text.toString().isEmpty() or rpass.text.toString().isEmpty()){
                Toast.makeText(this, "შეიყვანეთ პაროლი!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}