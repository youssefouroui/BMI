package com.learning.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weightText = findViewById<EditText>(R.id.etweight)
        val heightText = findViewById<EditText>(R.id.etHeight)
        val clikbutton = findViewById<Button>(R.id.btnCalculate)
        val index = findViewById<TextView>(R.id.tvindex)
        val info = findViewById<TextView>(R.id.tvinfo)
        clikbutton.setOnClickListener {
            val weight = weightText.text.toString()
            val height = heightText.text.toString()
            var bmi = weight.toFloat() / ((height.toFloat() / 100) * (height.toFloat() / 100))



            index.text = bmi.toString()
            info.text = "(normal range is 18,5-24,9)"


        }
    }
 }