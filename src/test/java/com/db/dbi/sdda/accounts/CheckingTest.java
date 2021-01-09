package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.Constants;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CheckingTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void checkingBookingOk() throws BankingException {
        IAccount l = new AccountImpl();
        l.book(Money.of(-5000, Constants.currencyUnit));
        l.book(Money.of(1000, Constants.currencyUnit));
        Assert.assertEquals("Balance -4000 expected", -4000, l.getBalance().getNumber().doubleValue(), 0);
    }

    @Test
    public void checkingBookingNoFunds() throws BankingException {
        exception.expect(BankingException.class);
        IAccount l = new AccountImpl();
        Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));
    }


}
