package com.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.chapter3.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var secondBinding: ActivitySecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        secondBinding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(secondBinding.root)
        intentActivity()
        intentBundle()
    }

    private fun intentActivity() {
        val nameOne = intent.getStringExtra("nameOne")
        secondBinding.tvIntent.text = nameOne
    }

    private fun intentBundle() {
        val result = intent.extras
        val nameTwo = result?.getString("nameTwo")
        secondBinding.tvBundle.text = nameTwo
    }
}