package com.example.android_study.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android_study.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun goToMainActivity(view: View?) {
        val intent = Intent(this@SecondActivity, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_up, R.anim.slide_down)
    }

}