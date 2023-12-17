package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("test")
    fun getString(): String{
        return "connect to FrontEnd"
    }

    @GetMapping("/test1")
    fun blog(): String {
        return "blog"
    }
}