package com.example.firebaseuiauth

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val auth = FirebaseAuth.getInstance()

        val btnSignInAnon = findViewById<Button>(R.id.btnSignInAnon)

        btnSignInAnon.setOnClickListener {
            auth.signInAnonymously()

        }
    }

}