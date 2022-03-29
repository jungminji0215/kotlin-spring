package com.example.mvc.controller.get

import com.example.mvc.model.http.UserRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController // REST API Controller로 동작하겠다.
@RequestMapping("/api")
class GetApiController {

    // http://localhost:8080/api/hello
    @GetMapping("/hello")
    fun hello() : String{
        return "hello kotlin"
    }

    // http://localhost:8080/api/get-mapping/path-variable/minji
    @GetMapping("/get-mapping/path-variable/{name}")
    fun pathVariable(@PathVariable name : String): String {
        println(name)
        return name
    }

    @GetMapping("/get-mapping/query-param/object")
    fun queryParamObject(userRequest : UserRequest): UserRequest {
        println(userRequest)
        return userRequest
    }
}