package com.example.androidcontactmanager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcontactmanager.R

class SecondActivity : AppCompatActivity() {
    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }

    override fun onStart() = super.onStart().also { Log.d(TAG, "onStart") }
    override fun onResume() = super.onResume().also { Log.d(TAG, "onResume") }
    override fun onPause() = super.onPause().also { Log.d(TAG, "onPause") }
    override fun onStop() = super.onStop().also { Log.d(TAG, "onStop") }
    override fun onDestroy() = super.onDestroy().also { Log.d(TAG, "onDestroy") }
}
