package com.example

class CounterModel {
    private var count = 0
    fun inc(){
        --count
    }
    fun dec (){
        ++count
    }
    fun getCountResult() = count
}