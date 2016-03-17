package Device;

/**
 * Created by Александр on 13.03.2016.
 */
public class Main {
    public static void main(String[] args){
        int power;
        int consumentEnergy;

        Laptop laptop = new Laptop(48, 12);
        Phone phone = new Phone(10, 3);
        TVset tvset = new TVset(0, 20);

        System.out.println(laptop.work());
        System.out.println(phone.work());
        System.out.println(tvset.work());

    }
}
