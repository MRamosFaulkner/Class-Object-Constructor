
public class Main {
    public static void main(String[] args) {

        //Objects created
        BankAccount holder1 = new BankAccount("John", 500);
        holder1.deposit(100);
        holder1.printDetails();

        BankAccount holder2 = new BankAccount("Larry", 5000);
        holder2.withdrawal(100);

        BankAccount holder3 = new BankAccount("Macy", 300);
        holder3.deposit(100);

        System.out.println(holder2);
        System.out.println(holder3);

    }
}