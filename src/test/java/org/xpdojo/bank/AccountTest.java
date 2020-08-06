package org.xpdojo.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    private Account account = Account.createAccount();


    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        assertThat(account.balance() ).isEqualTo(0);
    }

    @Test
    public void depositAnAmountShouldIncreaseTheBalance()
    {
        Account account = Account.createAccount();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultipleTimesShouldIncreaseTheBalanceProperly()
    {
        Account account = Account.createAccount();
        account.deposit(10);
        account.deposit(50);
        assertThat(account.balance()).isEqualTo(60);
    }

    @Test
    public void withdrawFromEmptyAccountShouldNotBeAllowed()
    {

        Exception exception = assertThrows(RuntimeException.class, () -> {
            Account.createAccount().withdraw(10);
        });

        String expectedMessage = "operation not supported";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));



    }
}
