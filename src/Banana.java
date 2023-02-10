public class Banana {
    private int vitamin;

    public int getVitamin() {
        return vitamin;
    }

    public void setVitamin(int vitamin) {
        this.vitamin = vitamin;
    }

    public Banana(int vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Banana: " +
                " vitamin - " + vitamin;
    }
}
