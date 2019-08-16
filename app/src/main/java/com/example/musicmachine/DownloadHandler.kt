package com.example.musicmachine

import android.os.Handler
import android.os.Message
import android.util.Log

class DownloadHandler : Handler() {

    companion object {
        val TAG = DownloadHandler::class.simpleName
    }

    override fun handleMessage(msg: Message?) {
        downloadSong(msg.toString())
    }

    private fun downloadSong(song: String) {
        val endTime = System.currentTimeMillis() + 10 * 1000
        while (System.currentTimeMillis() < endTime) {
            Thread.sleep(1000)
        }
        Log.d(TAG, "Song Downloaded: $song")
    }

}