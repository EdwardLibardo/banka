import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Cashier implements Supplier<String> {
    private String name;
    private Boolean free;
    private Client assignedcli;
    private int assignedti;

    public Cashier(String name, Boolean free, Client assginedcli) {
        this.name = name;
        this.free = free;
        this.assignedcli = assginedcli;

    }
    public String attendClient()
    {
        assignedti=(int)(Math.random()*10)+5;
        try {
            Thread.sleep(assignedti*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name+" "+assignedcli.getName()+" "+assignedcli.getOperation();
    }

    @Override
    public String get() {
     return attendClient();
    }

    public boolean availability() {
        return free;
    }

    public int getassignedti(){
        return assignedti;
    }


    public void toAssigClient(Client assignedcli) {
        this.assignedcli=assignedcli;
    }

    public void cashierisvailable(boolean free) {
        this.free = free;
    }
}
