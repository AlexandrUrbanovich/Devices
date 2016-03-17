package Device;

/**
 * Created by Александр on 13.03.2016.
 */
public class Device {
    int power;
    int consumentEnergy;

    public boolean work(){
        if(power > 0){
            power -= consumentEnergy;
        }else {
            System.out.println("Зарядите устройство!");
        }
        return true;
    }

    public Device(int power, int consumentEnergy) {
        this.power = power;
        this.consumentEnergy = consumentEnergy;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getConsumentEnergy() {
        return consumentEnergy;
    }

    public void setConsumentEnergy(int consumentEnergy) {
        this.consumentEnergy = consumentEnergy;
    }
}
