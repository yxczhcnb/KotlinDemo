package com.example.kotlindemo.controller

import com.example.kotlindemo.common.BaseResult
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

abstract class BaseController {
    fun <T> response(code:Int,data:T?,message:String):ResponseEntity<BaseResult<T>>{
        return ResponseEntity(BaseResult(code, data, message),HttpStatus.OK)
    }
}