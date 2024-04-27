package com.example.dz_mon6_dz1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.CounterModel

class CounterViewModel() : ViewModel() {
    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int> = _counter
    private val counterModel = CounterModel()
    fun dec() {
        counterModel.dec()
        _counter.value = counterModel.getCountResult()
    }

    fun inc() {
        counterModel.inc()
        _counter.value = counterModel.getCountResult()
    }
}


