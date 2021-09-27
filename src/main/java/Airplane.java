public class Airplane implements Drivable, Tradable {
    private int maxSpeed;

    public Airplane() {
        this.maxSpeed = 1100;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 100;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 100;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100000000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
