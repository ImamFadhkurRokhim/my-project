package com.example.instantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsern)
        etPassword = findViewById(R.id.etPass)
        login = findViewById(R.id.btnLogin)

        login.setOnClickListener {
            if (etUsername.text.toString() == "admin" && etPassword.text.toString() == "admin"){
                val text = "Berhasil Login"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()

                val moveActivity = Intent(this@MainActivity, hompageActivity::class.java)
                startActivity(moveActivity)
            }
            else{
                val text = "Username atau Password salah"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }
    }
}