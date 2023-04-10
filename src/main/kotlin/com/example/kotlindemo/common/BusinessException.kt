package com.example.kotlindemo.common

class BusinessException(code: Int,message: String): RuntimeException() {

    constructor() : this(0,"")
    constructor(message: String) : this(0,message)
    var code:Int = 0
        get() = field
        set(value) {
            field = value
        }

    override var message:String = message
        get() = field
        set(value) {
            field = value
        }
}