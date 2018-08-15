public class Client {
    private String name;
    private BankOperation bankOperation;

    public Client(String name, BankOperation bankOperation) {
        this.name = name;
        this.bankOperation = bankOperation;
    }

    public void performOperation(){

    }

    public String getName() {
        return name;
    }

    public BankOperation getOperation() {
        return bankOperation;
    }
}
