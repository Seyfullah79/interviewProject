package com.db.dbi.sdda.bl;

import com.db.dbi.sdda.dto.ITransfer;
import com.db.dbi.sdda.dto.ITransferResult;
import com.db.dbi.sdda.error.ErrorCodes;
import com.db.dbi.sdda.persistence.IAccountsRepo;
import org.junit.Assert;
import org.junit.Test;

public class BookingExecutorTest {

    private static final IAccountsRepo accountsRepo = null; //TODO:


    @Test
    public void bookingCheckingOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue("Booking needs to go through", transferResult.isTransferOk());
    }

    @Test
    public void bookingCheckingNotEnoughFunds() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse("Account should not have enough", transferResult.isTransferOk());
        Assert.assertEquals("Should have " + ErrorCodes.NOTSUFFICIENTFUNDS, transferResult.getReason(), ErrorCodes.NOTSUFFICIENTFUNDS);
    }

    @Test
    public void bookingSavingsOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue("Booking needs to go through", transferResult.isTransferOk());
    }

    @Test
    public void bookingSavingsFails() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse("Booking needs to fail", transferResult.isTransferOk());
    }

    @Test
    public void bookingLoanOk() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertTrue("Booking needs to go through", transferResult.isTransferOk());
    }

    @Test
    public void bookingLoanFails() throws Exception {
        ITransfer transfer = null;//TODO:

        ITransferResult transferResult = null;//TODO:
        Assert.assertFalse("Booking needs to fail", transferResult.isTransferOk());
    }
}
