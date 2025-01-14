package oop1.shop;

// SK
abstract public class Television implements ElectronicDevice {

    private String theMake, theModel;

    public Television(String aMake, String aModel) {
        theMake = aMake;
        theModel = aModel;
    }

    @Override
    public String getTheMake() {
        return theMake;
    }

    @Override
    public String getTheModel() {
        return theModel;
    }

    @Override
    public String toString() {
//        return getTheMake() + " " + getTheModel() + " " + this.getClass().getSimpleName();
        return theMake + " " + getTheModel();
    }
}

class Plasma extends Television implements HighlyDesirable {

    Plasma(String aMake, String aModel) {
        super(aMake, aModel);// calls the Television constructor
    }

    @Override
    public void turnOn() {
        System.out.println("Plasma::turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Plasma::turnOff");
    }
}

class LED extends Television {

    LED(String aMake, String aModel) {
        super(aMake, aModel);
    }

    @Override
    public void turnOn() {
        System.out.println("LED::turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("LED::turnOn");
    }
}
//
//class LCD extends Television {
//
//    public LCD(String aMake, String aModel) {
//        super(aMake, aModel);
//    }
//
//    @Override
//    public void turnOn() {
//        System.out.println("LCD::turnOn");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("LCD::turnOn");
//    }
//}
