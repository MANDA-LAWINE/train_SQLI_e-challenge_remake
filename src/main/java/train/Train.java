package train;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Train {

    private final static String WAGONS_SEPARATOR = "::";

    private List<Wagon> wagons = new LinkedList<>();


    private Train(){

    }

    public Train(String trainWagons){
        makeTrain(trainWagons);
    }

    private void makeTrain(String trainWagons) {
        for (int i = 0; i < trainWagons.length(); i++) {
            Wagon wagon = WagonFactory.getWagon(trainWagons.charAt(i));
            wagons.add(wagon);
        }

        isLastWagonHead();
    }

    private void isLastWagonHead() {
        if(wagons.get(wagons.size() - 1 ) instanceof Head){
            ((Head) wagons.get(wagons.size() - 1 )).isFirst(false);
        }
    }

    public void detachEnd() {
        if (!wagons.isEmpty()) {
            wagons.remove(wagons.size() - 1);
        }
    }

    public void detachHead() {
        if (!wagons.isEmpty()) {
            wagons.remove(0);
        }
    }

    public boolean fill() {

        for (Wagon wagon :
                wagons) {
            if (wagon instanceof Cargo) {
                if (((Cargo) wagon).fill()) {
                    return true;
                }
            }
        }

        return false;
    }

    public String print() {
        return wagons.stream().map(Wagon::print).collect(Collectors.joining(WAGONS_SEPARATOR));
    }
}
