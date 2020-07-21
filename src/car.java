
public class car {
    private String plate;
    private String color;
    private int year;
    private carType type;

    public car(String plate, String color, int year, carType type) {
        this.plate = plate;
        this.color = color;
        this.year = year;
        this.type = type;
    }
    
    public String toString() {
        return String.format("%15s %15s %15d %s", plate, color, year, type.toString());
    }
    
    
}
