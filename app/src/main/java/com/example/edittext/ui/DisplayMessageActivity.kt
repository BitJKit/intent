package com.example.edittext.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.edittext.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDisplayMessageBinding
    private var result = ""
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDisplayMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fName = intent.extras?.get(FNAME_EXTRA) ?: "0"
        val lName = intent.extras?.get(LNAME_EXTRA) ?: "1"
        val email = intent.extras?.get(EMAIL_EXTRA) ?: "2"
            result = ("First Name: " + fName+ "\n Last name: "+ lName + "\nEmail: "+ email)
        binding.resultTv.text = result.toString()
    }
}

