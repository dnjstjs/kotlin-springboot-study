package ai.nota.rbac.domain.account.repository

import ai.nota.rbac.application.account.entity.Account

interface AccountRepository {
    fun save(account: Account): Account
    fun findByAccountId(accountId: Long): Account
}
