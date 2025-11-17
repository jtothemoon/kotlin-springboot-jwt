package com.example.demo.common.exception

class InvalidInputException (
    val fieldName: String = "",
    message: String = "invalid input"
) : RuntimeException(message)