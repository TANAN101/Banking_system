class BankAccount {
    String name;

    private int Balance;


    void deposit(int amount) {
        Balance += amount;
    }

    void ShowBalance() {
        System.out.println("Balance: " + Balance);
    }
}
class SavingsAccount extends BankAccount{
        void Addinterest(){
            System.out.println("Deposited into "+name+"'s Account!!");
        }
}

 public class Banking_system{
    public static void main(String[] args) {
SavingsAccount acc001=new SavingsAccount();
acc001.deposit(100000000);
acc001.deposit(200000000);
acc001.name="ABDI BEZU";
acc001.ShowBalance();
acc001.Addinterest();
    }

}


