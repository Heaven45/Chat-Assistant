package com.example.chatassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.chatassistant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val name: String = "Ivan"
    val surname: String = "Ivanov"
    var age: Int = 37
    var height: Double = 172.2

    var finalText: String = "name: $name surname: $surname age: $age height: $height"

    private lateinit var binding: ActivityMainBinding
    val TAG: String = "MainActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.output.text = finalText
        Log.d(TAG, "end of onCreate function")
    }
}