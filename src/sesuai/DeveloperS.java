package sesuai;

public class DeveloperS implements Bekerja, Makan {

    @Override
    public void kerja() {
        System.out.println("Developer sedang bekerja");
    }

    @Override
    public void makan() {
        System.out.println("Developer sedang makan");
    }
}
