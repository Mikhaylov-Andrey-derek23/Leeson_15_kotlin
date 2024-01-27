package com.example.lesson_15

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {



    //Темы: Жизненый цикл активити, фрагмент
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("ACTIVITY_LIFECYCLE", "onCreate worked")
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FirstFragment())
            .commit()

    }



    override fun onStart() {
        super.onStart()
        Log.e("ACTIVITY_LIFECYCLE", "onStart worked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("ACTIVITY_LIFECYCLE", "onRestart worked")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ACTIVITY_LIFECYCLE", "onResume worked")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ACTIVITY_LIFECYCLE", "onPause worked")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ACTIVITY_LIFECYCLE", "onStop worked")
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}