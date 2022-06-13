package com.example.circlecitest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validateButton.setOnClickListener {
            val emailInput = emailEditText.text.toString()
            val result = EmailValidator.isValidEmail(emailInput)
            val resultMessage = "Email is ${if (result) {"OK"} else {"not OK"}}"
            val resultColor = if(result) { Color.parseColor("green")} else {Color.parseColor("red")}
            resultTextView.text = resultMessage
            resultTextView.setTextColor(resultColor)
        }
    }
}