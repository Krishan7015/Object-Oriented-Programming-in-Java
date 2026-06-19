class bankaccount {

    String ownerName;

    String accountNumber;
    
    double balance=0;

    int minBalance = 1000;
 
    String[] history = new String[1000];

    int transactionCount=0;

    static int totalCustomers;

    {
        totalCustomers++;
    }

    bankaccount(String ownerName, String accountNumber) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
    }

    bankaccount(String accountNumber) {
        this("Unknown", accountNumber);
    }

    void deposit(double amount) {
        if(amount>0) {
            this.balance+=amount;
            System.out.println("Amount " + amount + " deposited successfully.");
            System.out.println("Total Balance: "+this.balance);
            this.history[transactionCount] =  "Deposited :" + amount;
            transactionCount++;
        }
        else{
            System.out.println("Can't deposit amount.");
        }
    }

    void withdraw(double amount) {
        if(amount>0) {
            if(this.balance - amount >= this.minBalance){
                this.balance-=amount;
                System.out.println("\nAmount " + amount + " withdrawal successfully.");
            this.history[transactionCount] =  "Withdrawal :" + amount;
            transactionCount++;   
            }
            else{
                System.out.println("Can't withdraw money because according to policy, minimum balance of 1000 INR should be maintained.");
            }
        }
        else{
            System.out.println("Error! Can't withdraw.");
        }
        System.out.println("Total Balance: "+this.balance);
        System.out.println("");
    }
    void displayInfo() {
        System.out.println("\nCustomer Name: "+this.ownerName);
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Total balance: "+this.balance);
        System.out.println("");
    }

    void transactionHistory() {
        for(int i = 0; i<transactionCount; i++) {
            System.out.println(this.history[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        bankaccount MeraKhata = new bankaccount("Krishan", "312000038738");
        MeraKhata.displayInfo();
        MeraKhata.deposit(2500);
        MeraKhata.withdraw(600);
        MeraKhata.transactionHistory();
    }
}

