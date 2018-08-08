import java.util.Random;

public class Cashier  {
    boolean cash ;

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }
    public void cashiMethod(){

        if (getRandomBoolean()==false){
            System.out.println("You will not be attended by the cashier");
        }

        if (getRandomBoolean()==true){
            System.out.println("You will be attended by the cashier");
        }

    }

}
