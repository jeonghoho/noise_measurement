package com.kakao.talk.noisemeasurement.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakao.talk.noisemeasurement.databinding.ActivityMainBinding
import com.kakao.talk.noisemeasurement.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}