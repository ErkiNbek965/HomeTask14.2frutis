public class Apple extends Fruits {
    Banana vitamin;
    private int weight;


    public Banana getVitamin() {
        return vitamin;
    }

    public void setVitamin(Banana vitamin) {
        this.vitamin = vitamin;
    }

    public int getWeight() {
        return weight;
    }

    public Apple(String type, int size, Banana vitamin, int weight) {
        super(type, size);
        this.vitamin = vitamin;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Apple: " +
                " vitamin - " + vitamin +
                " weight - " + weight ;
    }
}
