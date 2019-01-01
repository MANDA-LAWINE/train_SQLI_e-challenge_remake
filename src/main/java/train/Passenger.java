package train;

public class Passenger extends Wagon {
    private final static String CARGO_REPRESENTER = "|OOOO|";
    @Override
    public String print() {
        return CARGO_REPRESENTER;
    }
}
