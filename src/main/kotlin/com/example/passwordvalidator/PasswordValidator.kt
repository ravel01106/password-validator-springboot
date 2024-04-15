package com.example.passwordvalidator

class PasswordValidator {
    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8 && hasLowerCase(password) && hasNumber(password) && hasUnderscore(password)
                && hasUpperCase(password)
    }

    private fun  hasNumber(password: String):Boolean{
        val number = password.count{it.isDigit()}
        return number >= 1
    }
    private fun hasUnderscore(password: String):Boolean{
        val predicateUnderscore: (Char) -> Boolean = { it == '_' }
        val underscore = password.find(predicateUnderscore).toString()
        return underscore.length == 1
    }
    private fun hasLowerCase(password: String):Boolean{
        val regex = """[a-z]""".toRegex()
        val lowerCases = regex.containsMatchIn(password)
        return lowerCases
    }
    private fun hasUpperCase(password: String): Boolean{
        val regex = """[A-Z]""".toRegex()
        val upperCases = regex.containsMatchIn(password)
        return upperCases
    }
}