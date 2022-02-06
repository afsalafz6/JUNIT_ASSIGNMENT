import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankException {
    public void withdraw(double amount,double balance) {
        try {
            if(amount>balance) {
                throw new InsufficientFundsException("Insufficient fund in acccount");
            }
            else if(amount<balance) {
                System.out.println("Withdraw successfull");
            }
        }
        catch(InsufficientFundsException e) {
            System.out.println(e);
        }
    }

    @Test
    void testBankException() {
        BankException bank=new BankException();
        assertThrows(InsufficientFundsException.class,()->bank.withdraw(6000.0, 5000.0));
        assertThrows(InsufficientFundsException.class,()->bank.withdraw(3000.0, 2000.0));
        assertThrows(InsufficientFundsException.class,()->bank.withdraw(4000.0, 3000.0));
    }
}

