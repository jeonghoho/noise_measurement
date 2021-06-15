package com.kakao.talk.noisemeasurement.controller

import android.media.MediaRecorder

class RecorderController {
    private val recorder: MediaRecorder = MediaRecorder()

    init {
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
    }

    fun startRecord() {
        recorder.prepare()
        recorder.start()
    }

    fun stopRecord() {
        recorder.stop()
    }

    fun finishRecord() {
        recorder.release()
    }
}