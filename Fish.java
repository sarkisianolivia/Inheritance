public class Fish {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins) {
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
