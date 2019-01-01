package train;

public class Head extends Wagon {
    private final static String HEAD_FIRST_REPRESENTER  = "<HHHH";
    private final static String HEAD_LAST_REPRESENTER   = "HHHH>";

    private boolean headFirstWagon = true;

    public Head(){}

    @Override
    public String print() {
        return headFirstWagon ? HEAD_FIRST_REPRESENTER : HEAD_LAST_REPRESENTER;
    }

    public void isFirst(boolean first){
         this.headFirstWagon = first;
    }




}
