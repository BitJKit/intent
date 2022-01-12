package com.example.edittext.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.edittext.R

class DisplayMessageActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        var intent = intent
        val fName = intent.extras?.get(FNAME_EXTRA) ?: "0"
        val lName = intent.extras?.get(LNAME_EXTRA) ?: "1"
        val email = intent.extras?.get(EMAIL_EXTRA) ?: "2"

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "First Name: " + fName+ "\n Last name: "+ lName + "\nEmail: "+ email
    }
}
