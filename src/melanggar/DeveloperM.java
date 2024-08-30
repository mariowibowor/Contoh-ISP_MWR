package melanggar;

public class DeveloperM implements Pekerja {

    @Override
    public void work() {
        System.out.println("Developer sedang bekerja");
    }

    @Override
    public void eat() {
        System.out.println("Developer sedang makan");
    }
}
