package com.example.demo.controller

import com.example.passwordvalidator.PasswordValidator
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class PasswordValidatorController {
    @PostMapping("/password")
    fun checkPasswordValid(@RequestBody password:String):Boolean{
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid(password)
        return result
    }
}