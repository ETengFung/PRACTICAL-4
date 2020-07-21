
public class owner {
    private String name;
    private String ic;
    
    public owner(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }
    
    public String toString() {
        return String.format("%15s %15s", name, ic);
    }
    
    
}
