package cz.cvut.fel.sin.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@ResponseBody
@ResponseStatus(HttpStatus.OK)
@RequestMapping("")
class HelloWorldController {

    @GetMapping("/hello")
    fun helloWorld() = "Hello world"
}
