import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher {
    /**
     *
     */
    private List<Cashier> cashiers = new ArrayList<>();
    private List<Supervisor> supervi= new ArrayList<>();
    private List<Director> directors = new ArrayList<>();

    ExecutorService executor = Executors.newFixedThreadPool(10);

    private void cashiernumber (int Quantitycashiers){
        for(int i=1;i<=Quantitycashiers;i++){
            cashiers.add(new Cashier("Number of cashier # "+i,true));
        }
    }

    private Cashier cashierisavailable(){
        for(Cashier cashier:cashiers)
        {
            if(cashier.availability())
            {return cashier;}
        }
        return null;
    }



}

