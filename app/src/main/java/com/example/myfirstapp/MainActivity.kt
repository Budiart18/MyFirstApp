package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastButton()
        countButton()
    }
    private fun toastButton(){
        // find the toast_button by its ID and set a click listener
        findViewById<Button>(R.id.toast_button).setOnClickListener {
            // create a Toast with some text, to appear for a short time
            val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
            // show the Toast
            myToast.show()
        }
    }
    private fun countButton(){
        findViewById<Button>(R.id.count_button).setOnClickListener {
            countMe()
        }
    }
    private fun countMe() {
        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.textview_first)
        // Get the value of the text view.
        val countString = showCountTextView.text.toString()
        // Convert value to a number and increment it
        var count = countString.toInt()
        count++
        // Display the new value in the text view.
        showCountTextView.text = count.toString()
    }
}