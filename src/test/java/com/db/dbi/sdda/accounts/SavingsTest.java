package com.db.dbi.sdda.accounts;

import com.db.dbi.sdda.Constants;
import com.db.dbi.sdda.error.BankingException;
import org.javamoney.moneta.Money;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SavingsTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void savingsBookingOk() throws BankingException {
        IAccount l = new AccountImpl();
        l.book(Money.of(20, Constants.currencyUnit));
        Assert.assertEquals("Balance 20 expected", 20, l.getBalance().getNumber().intValue());
    }

    @Test
    public void savingsBookingSeveralBookingsOk() throws BankingException {
        IAccount l = new AccountImpl();
        l.book(Money.of(17, Constants.currencyUnit));
        l.book(Money.of(70.56, Constants.currencyUnit));
        l.book(Money.of(12.44, Constants.currencyUnit));
        l.book(Money.of(-99, Constants.currencyUnit));
        Assert.assertEquals("Balance 1 expected", 1, l.getBalance().getNumber().intValue());
    }

    @Test
    public void savingsBookingNoFunds() throws BankingException {
        exception.expect(BankingException.class);

        IAccount l = new AccountImpl();
        Money newBalance = l.book(Money.of(-5000, Constants.currencyUnit));
    }


}
