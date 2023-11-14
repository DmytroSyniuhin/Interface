package Models;

import Service.LinuxOS;
import Service.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android calls");
    }
    @Override
    public void sms() {
        System.out.println("Android sends sms");
    }
    @Override
    public void internet() {
        System.out.println("Android opens browser");
    }
    @Override
    public void loadLinus() {
        System.out.println("Starting the Linus");
    }
}