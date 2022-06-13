package com.example.circlecitest

import java.util.regex.Pattern

object EmailValidator {
    private val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
        "[a-zA-Z0-9+._%\\-]{1,256}" +
                "@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
    fun isValidEmail(email: String): Boolean {
        if(email.isEmpty()) {
            return false;
        }

        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }
}