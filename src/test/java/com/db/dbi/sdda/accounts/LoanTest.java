package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.Constants;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LoanTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void loanBookingOk() throws BankingException {
        IAccount l = new AccountImpl();
        l.book(Money.of(-5000, Constants.currencyUnit));
        Assert.assertEquals("Balance -5000 expected", -5000, l.getBalance().getNumber().intValue());
    }

    @Test
    public void loanBookingNoFunds() throws BankingException {
        exception.expect(BankingException.class);

        IAccount l = new AccountImpl();
        Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));

    }

    @Test
    public void loanBookingPositivBalance() throws BankingException {
        exception.expect(BankingException.class);

        IAccount l = new AccountImpl();
        Money newBalance = l.book(Money.of(5000, Constants.currencyUnit));

    }
}
