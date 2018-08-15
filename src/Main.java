import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    private static List<Client> clients = new ArrayList<>();

    public static void main(String[] args) {


    }

    public static void newclients(int numberclients) {
        for (int i = 0; i<=numberclients; i++) {
            clients.add(new Client("Client #" + i, getOperation()));
        }
    }

    private static BankOperation getOperation() {
        switch ((int) (Math.random() * 2) + 1) {
            case 1:
                return BankOperation.DEPOSITS;
            case 2:
                return BankOperation.ISSUES;
            case 3:
                return BankOperation.WITHDRAWALS;
                default:
                    return BankOperation.DEPOSITS;
        }

    }
}
