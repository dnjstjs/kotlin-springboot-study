package ai.nota.rbac.domain.service

interface EmailVerifyUseCase {
    fun sendVerifyCodeToEmail(email: String): String
    fun verifyEmailCode(email: String, code: String): Boolean
}