package com.example.kotlindemo.controller

import com.example.kotlindemo.common.BaseResult
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kt/ctl")
class DemoController: BaseController() {

    @GetMapping("/demo")
    fun demo():ResponseEntity<BaseResult<String>>{
        return response(1,null,"ctl");
    }
}

