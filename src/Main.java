import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        List<Client> clientsmain = new ArrayList<Client>();
        clientsmain.add(new Client(1,"Edward"));
        clientsmain.add(new Client(2,"Libardo"));
        clientsmain.add(new Client(3,"Michael"));
        clientsmain.add(new Client(4,"James"));
        clientsmain.add(new Client(5,"Falcao"));
        clientsmain.add(new Client(6,"Neymar"));
        clientsmain.add(new Client(7,"Messi"));
        clientsmain.add(new Client(8,"Cristiano"));
        clientsmain.add(new Client(9,"Dyabala"));
        clientsmain.add(new Client(10,"Kane"));

       for(int i=0; i<clientsmain.size();i++) {
           System.out.println(clientsmain.get(i).clients());

        }
       dispatcher.cashi.cashiMethod();



    }

}
