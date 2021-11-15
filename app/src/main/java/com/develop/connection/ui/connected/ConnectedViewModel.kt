package com.develop.connection.ui.connected

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ConnectedViewModel @Inject constructor(private val repository: ConnectedRepository): ViewModel() {


    val isConnected = MutableLiveData<Boolean>().apply {
        value = repository.isConnected
    }

}
