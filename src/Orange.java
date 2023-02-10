public class Orange extends Fruits{
    Banana vitamin;
      String color;

    public Orange(String type, int size, int i) {
        super(type,size);
    }


    public Banana getVitamin() {
        return vitamin;
    }

    public void setVitamin(Banana vitamin) {
        this.vitamin = vitamin;
    }

    public String getColor() {
        return color;
    }

    public Orange(String type, int size, Banana vitamin, String color) {
        super(type, size);
        this.vitamin = vitamin;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Orange: " +
                " vitamin - " + vitamin +
                " color - " + color ;
    }
}
