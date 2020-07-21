
public class carRegistration {
    static int currentRegNo = 1001;
    private int regNo;
    private owner Owner;
    private car car;
    
    public carRegistration(owner Owner, car car) {
        this.regNo = currentRegNo;
        this.Owner = Owner;
        this.car = car;
        
        currentRegNo++;
    }
    
    public String toString(){
        return String.format("%15d %s %s", regNo, Owner.toString(), car.toString());
    }
    
}
