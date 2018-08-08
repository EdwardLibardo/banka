import javafx.concurrent.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Dispatcher {

    Supervisor supervi = new Supervisor();
    Director direct =new Director();
    Cashier cashi = new Cashier();

    public void executor () {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int c=0; c==10;c++) {
        //executorService.execute(cashi.cashiMethod());
        }

    }

    // private List<Client> clients;
}
