package com.example.dz_mon6_dz1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val _counter = MediatorLiveData<Int>()
    val countre :LiveData<Int> get() = _counter
    init {
        _counter.value = 0
    }
    fun dec (){
        _counter.value = (_counter.value?:0)-1

    }
    fun inc(){
        _counter.value = (_counter.value?:0)+1

    }
}


