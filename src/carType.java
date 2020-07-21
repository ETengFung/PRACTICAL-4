
public class carType {
    
    private String maker;
    private String model;
    private double capacity;
    
    
    public carType(String maker, String model, double capacity) {
        this.maker = maker;
        this.model = model;
        this.capacity = capacity;
    }
    
    public String toString() {
        return String.format("%15s %15s %15s", maker, model, capacity);
    }
    
    
}
