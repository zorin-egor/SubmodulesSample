package com.sample.submodules

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sample.libchat.ui.views.chat.ChatView
import com.sample.library.ImDn

class MainActivity : AppCompatActivity() {

    // Sample instance of chat library
    private lateinit var chatInstance: ChatView

    // Sample instance of image download library
    private lateinit var imageDownload: ImDn

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}