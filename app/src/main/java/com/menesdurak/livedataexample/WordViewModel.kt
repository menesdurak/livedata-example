package com.menesdurak.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WordViewModel : ViewModel() {

    val currentWord: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}