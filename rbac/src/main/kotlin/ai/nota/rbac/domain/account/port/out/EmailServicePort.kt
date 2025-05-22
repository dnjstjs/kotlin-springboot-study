package ai.nota.rbac.domain.account.port.out

interface EmailServicePort {
    fun send(email: String, code: String): Boolean
}