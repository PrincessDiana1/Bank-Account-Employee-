import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Diana", "Smith",
                LocalDate.of(2000, 8,31), 10000);


        bankAccount.deposit(1000);
        System.out.println(bankAccount.getUpdatedBalance());

    }

}
