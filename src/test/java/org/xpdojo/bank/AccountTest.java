package org.xpdojo.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        assertThat(account.balance() ).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance()
    {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleTimesShouldIncreaseTheBalanceProperly()
    {
        Account account = new Account();
        account.deposit(10);
        account.deposit(50);
        assertThat(account.balance()).isEqualTo(60);
    }
}
