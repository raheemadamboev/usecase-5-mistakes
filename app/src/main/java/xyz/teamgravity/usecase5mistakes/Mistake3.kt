package xyz.teamgravity.usecase5mistakes

import android.util.Patterns

@Deprecated("This UseCase contains third party import which is from Android. The UseCase lives in Domain layer, so it should contain only pure language packages.")
class ValidateEmail {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun execute(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}