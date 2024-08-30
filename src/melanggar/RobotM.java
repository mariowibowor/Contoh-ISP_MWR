package melanggar;

public class RobotM implements Pekerja{

    @Override
    public void work() {
        System.out.println("Robot sedang bekerja");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot tidak makan");
    }
}
