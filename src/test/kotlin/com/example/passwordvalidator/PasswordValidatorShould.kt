package com.example.passwordvalidator

import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.Assertions.*
import org.assertj.core.api.Assertions.*

internal class PasswordValidatorShould{

    // Permit a password when meet all the conditions
    // Not permit a password when it doesn't have more than eight characters
    // Not permit a password when it doesn't have uppercase
    // Not permit a password when it doesn't have lowercase
    // Not permit a password when it doesn't have a number
    // Not permit a password when it doesn't have underscore
    @Test
    fun ` Permit a password when meet all the conditions`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("Manuel_Alejandro1998")
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun ` Not permit a password when it doesn't have more than eight characters`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("aaAA_")
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun ` Not permit a password when it doesn't have uppercase`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("manuel_alejandro1998")
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun ` Not permit a password when it doesn't have lowercase`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("MANUEL_ALEJANDRO1998")
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun ` Not permit a password when it doesn't have a number`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("Manuel_Alejandro")
        assertThat(result).isEqualTo(false)
    }

    @Test
    fun ` Not permit a password when it doesn't have underscore`() {
        val passwordValidator = PasswordValidator()
        val result = passwordValidator.isPasswordValid("ManuelAlejandro1998")
        assertThat(result).isEqualTo(false)
    }


}