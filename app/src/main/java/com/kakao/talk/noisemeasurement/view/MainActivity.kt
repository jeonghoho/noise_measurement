package com.kakao.talk.noisemeasurement.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakao.talk.noisemeasurement.controller.RecorderController
import com.kakao.talk.noisemeasurement.databinding.ActivityMainBinding
import com.kakao.talk.noisemeasurement.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val recorderController = RecorderController()
    private var isRecording = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.startingButton.setOnClickListener {
            if (isRecording) {
                isRecording = false
                recorderController.stopRecord()
            } else {
                isRecording = true
                recorderController.startRecord()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        recorderController.finishRecord()
    }
}