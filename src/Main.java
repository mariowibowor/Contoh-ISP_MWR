import melanggar.DeveloperM;
import melanggar.RobotM;
import sesuai.DeveloperS;
import sesuai.RobotS;


public class Main {
    public static void main(String[] args) {
        System.out.println("Contoh yang Melanggar ISP");
        System.out.println("==========================");
        DeveloperM DevM = new DeveloperM();
        DevM.work();
        DevM.eat();

        RobotM RobM = new RobotM();
        RobM.work();
        //RobM.eat(); Dibuat comment agar eksekusi berjalan sampai akhir
        System.out.println("=====================================================");
        System.out.println("Contoh yang Sesuai ISP");
        System.out.println("==========================");
        DeveloperS DevS = new DeveloperS();
        DevS.kerja();
        DevS.makan();

        RobotS RobS = new RobotS();
        RobS.kerja();
    }
}
