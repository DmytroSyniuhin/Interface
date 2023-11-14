import Models.Androids;
import Models.IPhones;
import Service.IOS;
import Service.LinuxOS;
import Service.Smartphones;

public class Program {
    public static void main(String[] args) {
        LinuxOS linuxAndroid = new Androids();
        linuxAndroid.loadLinus();

        Smartphones smartAndroid = new Androids();
        smartAndroid.display("Смартфони андроід");

        Androids androids = new Androids();
        androids.display("Андроіди");

        IOS iosIPhones = new IPhones();
        iosIPhones.loadIOS();

        Smartphones smartIphones = new IPhones();
        smartIphones.display("Смартфони айфон");

        IPhones iphones = new IPhones();
        iphones.display("Айфони");
    }
}