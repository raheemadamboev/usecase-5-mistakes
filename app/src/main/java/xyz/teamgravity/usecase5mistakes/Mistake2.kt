package xyz.teamgravity.usecase5mistakes

@Deprecated("This UseCase does not do business logic. It does presentation logic.")
class FormatSocialStatus {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    // 999 -> 999
    // 5642 -> 5.6K
    // 1000000 -> 1M
    fun execute(number: Long): String {
        if (number < 1_000L) return number.toString()

        val suffix = when {
            number >= 1_000_000L -> "M"
            else -> "K"
        }

        return when (number) {
            in 1_000L..999_999L -> String.format("%.1f%s", number / 1_000L, suffix)
            else -> String.format("%.1%s", number / 1_000_000L, suffix)
        }.replace(".0", "")
    }
}