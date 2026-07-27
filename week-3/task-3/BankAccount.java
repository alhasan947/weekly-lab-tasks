public class BankAccount {
    private int balance = 0;
    private boolean open = false;
    public synchronized void open() {
        open = true;
        balance = 0;
    }
    public synchronized void close() {
        open = false;
    }
    public synchronized void deposit(int amount) {
        if (!open) throw new IllegalStateException("Account closed");
        if (amount < 0) throw new IllegalArgumentException("Negative deposit");
        balance += amount;
    }
    public synchronized void withdraw(int amount) {
        if (!open) throw new IllegalStateException("Account closed");
        if (amount < 0) throw new IllegalArgumentException("Negative withdraw");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
    public synchronized int getBalance() {
        if (!open) throw new IllegalStateException("Account closed");
        return balance;
    }
}
