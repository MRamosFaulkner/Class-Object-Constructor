public class BankAccount {

    //Attributes that can only be used in this class (private)
    private String acctHolderName;
    private double acctBalance;

    //Constructor that takes the attributes as parameters to initialize
    public BankAccount(String acctHolderName, double acctBalance) {
        this.acctHolderName = acctHolderName;
        this.acctBalance = acctBalance;
    }

    //Different methods created
    public void deposit(double depositAmnt) {
        acctBalance += depositAmnt;
    }

    public void withdrawal (double amount) {
//        if (amount > this.acctBalance) {
//            System.out.println("Insufficient funds");
//        } else {
//            this.acctBalance = amount;
//        }
        acctBalance -= amount;
    }

    public void printDetails() {
        System.out.println("My balance is " + this.acctBalance + "\n");
    }

    public String toString() {
        return acctHolderName + "'s account balance: " + acctBalance;
    }

}
