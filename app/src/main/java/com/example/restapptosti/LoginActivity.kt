package com.example.restapptosti
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val inputEmail = findViewById<EditText>(R.id.inpEmail)
        val inputPassword = findViewById<EditText>(R.id.inpPassword)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            if(email == "prova@gmail.com" && password == "12345") {
                intent(MenuActivity::class.java)
            } else{
                val mioToast = Toast.makeText(this, "Credenziali errate!", Toast.LENGTH_SHORT)
                mioToast.show()
            }
        }
    }
    private fun intent(nomeActivity: Class<*>){
        val intent = Intent(this, nomeActivity)
        startActivity(intent)
    }
}