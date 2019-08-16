package com.example.musicmachine

import android.os.Bundle
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mDownloadButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = DownloadThread()
        thread.start()

        mDownloadButton = findViewById(R.id.downloadButton)
        mDownloadButton.setOnClickListener {
            Toast.makeText(this, "Downloading", Toast.LENGTH_SHORT).show()

            // Send Messages to Handler for processing
            for (song in Playlist.songs) {
                val message = Message.obtain()
                message.obj = song
                thread.mHandler.sendMessage(message)
            }
        }
    }


}
