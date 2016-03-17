package Device;

/**
 * Created by Александр on 13.03.2016.
 */
public class TVset extends Device {
    public static boolean work;

    public TVset(int power, int consumentEnergy) {
        super(power, consumentEnergy);
    }

    public boolean work(){
        if(power > 0){
            power -= consumentEnergy;
        }else {
            System.out.println("Подключите телевизор к электро сети!");
        }
        return true;
    }
}
