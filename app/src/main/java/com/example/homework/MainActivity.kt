package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        val GenerateRundomNumberButton = findViewById<Button>(R.id.GenerateRundomNumberButton)
        val randomNumberTextView = findViewById<TextView>(R.id.randomNumberTextView)
        val yesOrNo = findViewById<TextView>(R.id.yesOrNo)
        GenerateRundomNumberButton.setOnClickListener {
            val number:Int = randomNumber()
            d("generateNumber", "This is a random number ${devide(number)}")
            randomNumberTextView.text = devide(number)

        }
    }

    private fun randomNumber() =(-100..100).random()


    fun devide(randomNumber: Int): String{
        if (randomNumber%5==0 && randomNumber/5 > 0) {
            return "Yes"
        }else{
            return "No"
        }
    }



}