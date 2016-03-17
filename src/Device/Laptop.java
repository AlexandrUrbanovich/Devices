package Device;

/**
 * Created by Александр on 13.03.2016.
 */
public class Laptop extends Device {
    public static boolean work;

    public Laptop(int power, int consumentEnergy) {
        super(power, consumentEnergy);
    }

    public boolean work(){
        if(power > 0){
            power -= consumentEnergy;
        }else {
            System.out.println("Низкий уровень энергии!");
        }
        return true;
    }

}
