package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.dto.TransferResultImpl;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;

public class AccountImpl implements IAccount {
    @Override
    public Money book(Money amount) throws BankingException {
        return null;
    }

    @Override
    public TransferResultImpl checkForTransfer(Money amount) {
        return null;
    }

    @Override
    public String getIban() {
        return null;
    }

    @Override
    public Money getBalance() {
        return null;
    }
}
