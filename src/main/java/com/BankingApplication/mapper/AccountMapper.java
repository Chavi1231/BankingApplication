package com.BankingApplication.mapper;
import com.BankingApplication.dto.AccountDto;
import com.BankingApplication.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
        if (accountDto == null) {
            return null; // or throw an IllegalArgumentException
        }

        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        if (account == null) {
            return null; // or throw an IllegalArgumentException
        }

        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}

