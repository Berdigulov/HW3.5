package com.example.hw35

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var main = 0
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv_result)
        button = findViewById(R.id.btn)
        var test: Boolean = true
        button.setOnClickListener {
            if(test){
                main += 1
                textView.text = main.toString()
                if(main == 10){
                    button.text = "-"
                    test = false
                }
            }else if(button.text.equals("-"))
                main -= 1
                textView.text = main.toString()
                if (main == 0){
                    intent = Intent(applicationContext, SecondActivity::class.java)
                    startActivity(intent)
            }
        }
    }

}