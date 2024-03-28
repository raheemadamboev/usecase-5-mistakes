package xyz.teamgravity.usecase5mistakes

@Deprecated("Deciding what error message to display is responsibility of Presentation layer.")
class ValidatePassword {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun execute(password: String): Result {
        if (password.isEmpty()) return Result(
            valid = false,
            error = "Passwords can't be empty."
        )

        if (password.length < 9) return Result(
            valid = false,
            error = "Password length must be at least 9"
        )

        return Result(
            valid = true,
            error = null
        )
    }

    ///////////////////////////////////////////////////////////////////////////
    // MISC
    ///////////////////////////////////////////////////////////////////////////

    data class Result(
        val valid: Boolean,
        val error: String?
    )
}