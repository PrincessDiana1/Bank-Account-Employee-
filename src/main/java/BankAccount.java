import java.time.LocalDate;

public class BankAccount {

        //Properties

        String firstName;
        String lastName;
        LocalDate dateofbirth;
        int accountNumber = 0;
        int balance = 0;


        //Constructor
        // this gives the constructor instructions to know that the object currently being
        //worked on this is what it will be etc.


        public  BankAccount(String inputfirstName, String inputlastName, LocalDate dateofbirth, Integer balance){
            this.firstName = inputfirstName;
            this.lastName = inputlastName;
            LocalDate LocalDate = dateofbirth;
            this.accountNumber = 0;
            this.balance = 200;
        }


        //Methods / Behaviours

    //Create a method called deposit() that takes in an amount updates the balance of the BankAccount

    public void deposit(Integer Amountdeposited){
        balance += Amountdeposited;
        System.out.println("Deposited balance: " + Amountdeposited);
    }

    // new*
    public Integer getCurrentBalance(){
            return balance;
    }

    //Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount

    public void withdrawl(Integer Amountwithdrawl){
        balance -= Amountwithdrawl;
        System.out.println("New current balance: " + Amountwithdrawl);
            }

            public double getUpdatedBalance(){
                return balance;
        }
    }

    //provide a method to allow the account to pay interest




