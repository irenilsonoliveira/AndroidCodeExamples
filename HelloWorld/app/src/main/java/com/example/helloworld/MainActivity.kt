package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editTextPersonName = findViewById<EditText>(R.id.editTextPersonName)
        val showButton = findViewById<Button>(R.id.button)
        val textViewPersonName = findViewById<TextView>(R.id.textViewPersonName)

        showButton.setOnClickListener {
            val personName = editTextPersonName.text.toString()

            textViewPersonName.text = personName
        }
    }
}
