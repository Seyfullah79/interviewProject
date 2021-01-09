package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.dto.TransferResultImpl;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;

public interface IAccount {

    Money book(Money ammount) throws BankingException;

    TransferResultImpl checkForTransfer(Money ammount);

    String getIban();

    Money getBalance();
}
