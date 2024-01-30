package com.imbuka.accounts.mapper;

import com.imbuka.accounts.dto.AccountsDto;
import com.imbuka.accounts.entity.Accounts;

/**
 * A class to change AccountsEntity to AccountsDto and vice versa
 */
public class AccountsMapper {

    /**
     * It is going to map all data from AccountsEntity  to AccountDto
     *
     * @param accounts
     * @param accountsDto
     * @return
     */
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    /**
     * It is going to map all data from AccountsDto to Accounts Entity
     *
     * @param accounts
     * @param accountsDto
     * @return
     */
    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}
