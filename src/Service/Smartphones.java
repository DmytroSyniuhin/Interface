package Service;

public interface Smartphones {
    void call();
    void sms();
    void internet();
    default void display(String name) {
        System.out.println(name);
        call();
        sms();
        internet();
        System.out.println();
    }
}