package Models;

import Service.IOS;
import Service.Smartphones;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone calls");
    }
    @Override
    public void sms() {
        System.out.println("iPhone sends sms");
    }
    @Override
    public void internet() {
        System.out.println("iPhone opens browser");
    }
    @Override
    public void loadIOS() {
        System.out.println("Starting the iOS");
    }
}