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

}