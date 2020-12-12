package com.example.simpleoopdiceandcalculator

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
//    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    open fun initializationListeners() {}
}