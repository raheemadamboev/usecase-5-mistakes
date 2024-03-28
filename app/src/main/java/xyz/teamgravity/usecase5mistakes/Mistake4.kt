package xyz.teamgravity.usecase5mistakes

@Deprecated("Abstraction is necessary when you intend to implement multiple versions of it.")
class LoginUser(
    private val repository: AuthRepository
) : SuspendUseCase<Login, Boolean> {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    override suspend fun execute(input: Login): Boolean {
        return repository.login(input)
    }
}

interface SuspendUseCase<INPUT, OUTPUT> {
    suspend fun execute(input: INPUT): OUTPUT
}

interface AuthRepository {
    suspend fun login(input: Login): Boolean
}

data class Login(
    val username: String,
    val password: String
)