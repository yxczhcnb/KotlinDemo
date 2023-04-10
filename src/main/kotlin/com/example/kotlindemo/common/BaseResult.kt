package com.example.kotlindemo.common


class BaseResult<T>(code:Int,data:T?,message:String) {
    var code:Int = code
        get() = field
        set(value) {
            field = value
        }
    var data:T? = data
        get() = field
        set(value) {
            field = value
        }
    var message:String = message
        get() = field
        set(value) {
            field = value
        }
}