import java.util.ArrayList;

public class Hrac {
    private BalicekKaret karty;
    private String jmenoHrace;

    public Hrac(String jmenoHrace) {
        this.karty = new BalicekKaret(jmenoHrace);
        this.jmenoHrace = jmenoHrace;
    }

    @Override
    public String toString() {
        return  " karty " + karty ;
    }
}
