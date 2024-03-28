package xyz.teamgravity.usecase5mistakes

@Deprecated("The UseCase should have only single responsibility. Since this UseCase has more than one responsibility that validates full name and password publicly. It is marked as deprecated.")
class ValidateUserData {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun isValidFullName(fullName: String): Boolean {
        val names = fullName.split(" ").filter { it.isNotBlank() }
        return names.size > 1
    }

    fun isValidPassword(password: String): Boolean {
        val hasUppercase = password.any { it.isUpperCase() }
        val hasLowercase = password.any { it.isLowerCase() }
        val hasDigit = password.any { it.isDigit() }
        val hasValidLength = password.length > 8
        return hasUppercase && hasLowercase && hasDigit && hasValidLength
    }
}