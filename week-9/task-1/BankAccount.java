class BankAccount {
    private int balance;
    private boolean isOpen;

  public BankAccount() {
        this.balance = 0;
        this.isOpen = false;
    }
    public synchronized void open() {
        if (isOpen) {
            throw new IllegalStateException("Account already open");
        }
        isOpen = true;
        balance = 0;
    }
    public synchronized void close() {
        if (!isOpen) {
            throw new IllegalStateException("Account already closed");
        }
        isOpen = false;
    }
    public synchronized void deposit(int amount) {
        if (!isOpen) {
            throw new IllegalStateException("Account is closed");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        }
        balance += amount;
    }
    public synchronized void withdraw(int amount) {
        if (!isOpen) {
            throw new IllegalStateException("Account is closed");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw negative amount");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    public synchronized int getBalance() {
        if (!isOpen) {
            throw new IllegalStateException("Account is closed");
        }
        return balance;
    }
}
