package ru.movchan.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }

    fun btnClick(view: View) {
        var nextIntent = Intent(this, LoginActivity::class.java)
        startActivity(nextIntent)
    }
}