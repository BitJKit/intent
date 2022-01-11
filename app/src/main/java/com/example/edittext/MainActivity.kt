package com.example.edittext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
const val FNAME_EXTRA = "FNAME_EXTRA"
const val LNAME_EXTRA = "LNAME_EXTRA"
const val EMAIL_EXTRA = "EMAIL_EXTRA"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fNameEt = findViewById<EditText>(R.id.fNameEt)
        val lNameEt = findViewById<EditText>(R.id.lNameEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        saveBtn.setOnClickListener{
            var fName = fNameEt.text.toString()
            var lName = lNameEt.text.toString()
            var email = emailEt.text.toString()

            val intent = Intent(this@MainActivity, DisplayMessageActivity::class.java)
            intent.putExtra(FNAME_EXTRA, fName)
            intent.putExtra(LNAME_EXTRA, lName)
            intent.putExtra(EMAIL_EXTRA, email)
            startActivity(intent)
        }
    }
}