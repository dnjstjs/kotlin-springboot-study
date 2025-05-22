package ai.nota.rbac.domain.account.service

import ai.nota.rbac.application.account.dto.response.AccountSignupSuccessResponse
import ai.nota.rbac.application.account.entity.AccountRole

interface AccountCommandUseCase {
    fun signUp(
        email: String,
        password: String,
        tenantKey: String,
        role: AccountRole,
    ): AccountSignupSuccessResponse

}