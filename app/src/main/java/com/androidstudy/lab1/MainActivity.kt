package com.androidstudy.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        Log.i("onCreate", "Активити было создано")
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", "Старт")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "Приложение в процессе работы")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", "Был вызван ассистент")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", "Был открыт ассистент")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "Был осуществлен возврат к приложению")
    }

}