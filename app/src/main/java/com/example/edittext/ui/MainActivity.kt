package com.example.edittext.ui

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

    private lateinit var binding: ActivityMainBinding
    private var fName = ""
    private var lName = ""
    private var email = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            fName = fNameEt.text.toString()
            lName = lNameEt.text.toString()
            email = emailEt.text.toString()
            var saveBtn = findViewById<Button>(R.id.saveBtn)

            saveBtn.setOnClickListener{
                fName = fNameEt.text.toString()
                lName = lNameEt.text.toString()
                email = emailEt.text.toString()

                val intent = Intent(this@MainActivity, DisplayMessageActivity::class.java)
                intent.putExtra(FNAME_EXTRA, fName)
                intent.putExtra(LNAME_EXTRA, lName)
                intent.putExtra(EMAIL_EXTRA, email)
                startActivity(intent)
            }
        }


    }
}