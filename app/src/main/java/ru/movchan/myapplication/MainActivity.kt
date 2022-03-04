package ru.movchan.myapplication

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextIntent = Intent(this, HelloActivity::class.java)

        val timer = object: CountDownTimer(2000, 1) {
            override fun onTick(millisUntilFinished: Long) {


            }

            override fun onFinish() {
                startActivity(nextIntent)
            }
        }
        timer.start()


    }
}