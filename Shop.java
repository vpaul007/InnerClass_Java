package oop1.shop;

//SK

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
        ArrayList<ElectronicDevice> devices = new ArrayList<>();

        ElectronicDevice sonyPlasma = new Plasma("Sony", "P300");
        devices.add(sonyPlasma);

        ElectronicDevice dellInspiron = new Laptop("Dell", "Inspiron");
        devices.add(dellInspiron);

        processDevices(devices);
        
    }

    public static void processDevices(ArrayList<ElectronicDevice> devices) {
        // enhanced for loop
        for (ElectronicDevice device : devices) {
            System.out.print(device);
            if (device instanceof HighlyDesirable) {
                System.out.println(" - Highly Desirable Item");
            }
            System.out.println();// blank line
        }
    }

}
