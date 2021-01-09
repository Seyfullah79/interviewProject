package com.db.dbi.sdda.dto;

import org.javamoney.moneta.Money;

public interface ITransfer {

    String getIban();

    Money getAmount();
}
