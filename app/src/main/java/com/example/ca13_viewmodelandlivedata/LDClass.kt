package com.example.ca13_viewmodelandlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LDClass : ViewModel() {
    val counter = MutableLiveData<Int>()
    init {
        counter.postValue(0)
    }
    fun incNumber(){
        counter.postValue((counter.value?:0)+1)
    }
}