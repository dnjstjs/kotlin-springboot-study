package ai.nota.rbac.domain.account.service

import ai.nota.rbac.application.account.dto.response.AccountSignupSuccessResponse
import ai.nota.rbac.application.account.entity.Account
import ai.nota.rbac.application.account.entity.AccountRole
import ai.nota.rbac.domain.account.repository.AccountRepository

class AccountCommandService(
    private val accountRepository: AccountRepository,
):AccountCommandUseCase {
    override fun signUp(
        email: String,
        password: String,
        tenantKey: String,
        role: AccountRole
    ): AccountSignupSuccessResponse {
        val account = Account.createActiveAccount(email, password, tenantKey, role)
        val createdAccount = accountRepository.save(account)
        return AccountSignupSuccessResponse(
            id = createdAccount.id,
            createdAt = createdAccount.createdAt
        )
    }
}