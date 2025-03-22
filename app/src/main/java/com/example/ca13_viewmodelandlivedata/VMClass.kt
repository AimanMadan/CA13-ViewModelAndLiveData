package com.example.ca13_viewmodelandlivedata

import androidx.lifecycle.ViewModel

class VMClass : ViewModel() {
    var counter = 0
    fun incNumber(){
        counter ++
    }
}