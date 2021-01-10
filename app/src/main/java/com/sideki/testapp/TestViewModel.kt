package com.sideki.testapp

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named ("String2") val testingString2: String
): ViewModel() {

    fun getString2():String{
        return testingString2
    }

}