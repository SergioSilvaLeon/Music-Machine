package com.example.musicmachine

import android.os.Looper

class DownloadThread : Thread() {

    init {
        name = "DownloadThread"
    }

    lateinit var mHandler: DownloadHandler

    override fun run() {
        // Creates looper for the thread and creates message Queue
        Looper.prepare()
        mHandler = DownloadHandler()
        // Loop through message queue
        Looper.loop()
    }

}