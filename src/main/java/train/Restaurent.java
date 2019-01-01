package train;

public class Restaurent extends Wagon {
    private final static String RESTO_REPRESENTER = "|hThT|";
    @Override
    public String print() {
        return RESTO_REPRESENTER;
    }
}
