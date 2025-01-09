package com.app.notice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NoticeController {

    @GetMapping
    fun test():String{

        return "Hello"
    }
}