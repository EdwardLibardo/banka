import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Cashier implements Supplier<String> {
    private String name;
    private Boolean free;

    public Cashier(String name, Boolean free) {
        this.name = name;
        this.free = free;
    }

    @Override
    public String get() {
        return null;
    }

    public boolean availability() {
        return free;
    }

    public void setAvailability(boolean free) {
        this.free= free;
    }
}
