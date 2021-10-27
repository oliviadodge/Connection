package com.develop.connection.ui.chatsList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatsListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a chats list Fragment"
    }
    val text: LiveData<String> = _text
}