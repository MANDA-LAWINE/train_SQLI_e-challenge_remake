package train;

public class WagonFactory {


    public static Wagon getWagon(char wagon) throws IllegalArgumentException{
        switch (wagon){
            case 'H': return new Head();
            case 'P': return new Passenger();
            case 'R': return new Restaurent();
            case 'C': return new Cargo();
            default: throw new IllegalArgumentException();
        }
    }
}
