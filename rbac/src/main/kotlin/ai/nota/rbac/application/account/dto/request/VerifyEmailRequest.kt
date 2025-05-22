package ai.nota.rbac.application.account.dto.request


data class VerifyEmailRequest(
    val email: String,
    val code: String
)