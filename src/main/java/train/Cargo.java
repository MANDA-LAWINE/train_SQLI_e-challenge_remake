package train;

public class Cargo extends Wagon {
    private final static String CARGO_EMPTY_REPRESENTER = "|____|";
    private final static String CARGO_FULL_REPRESENTER = "|^^^^|";

    private boolean isFull = false;

    public Cargo(){

    }

    public Cargo(boolean isFull){
        this.isFull = isFull;
    }

    @Override
    public String print() {
        return isFull ? CARGO_FULL_REPRESENTER : CARGO_EMPTY_REPRESENTER;
    }

    public boolean fill(){
        if(isFull) return false;

        this.isFull = true;

        return true;
    }




}
