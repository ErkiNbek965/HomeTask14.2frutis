public class Fruits {
private String type;
private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Fruits(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Fruits: " +
                " type - " + type + '\n' +
                " size - " + size;
    }
}

