import java.util.Arrays;

public class StavHry {
    private BalicekKaret licemdolu;
    private BalicekKaret licemnahoru;
    private int pocethracu;
    private Hrac[] hraci;

    public BalicekKaret getLicemdolu() {
        return licemdolu;
    }

    public BalicekKaret getLicemnahoru() {
        return licemnahoru;
    }

    public StavHry(String[] jmenaHracu) {
        this.licemdolu =new BalicekKaret(" licem dolu");
        this.licemnahoru =new BalicekKaret("licem nahoru");
        this.pocethracu = jmenaHracu.length;
        this.hraci = new Hrac[pocethracu];
        for (int i = 0; i < pocethracu; i++) {
            hraci[i] = new Hrac(jmenaHracu[i]);
        }
        // smazat
        licemnahoru.pridejKartu(new MariasovaKarta("listy","sedma"));
        licemnahoru.pridejKartu(new MariasovaKarta("listy","osmicka"));
        licemnahoru.pridejKartu(new MariasovaKarta("listy","kralovna"));
        licemnahoru.pridejKartu(new MariasovaKarta("listy","devitka"));

    }



    @Override
    public String toString() {
        return Arrays.toString(hraci) + "StavHry{" + licemdolu + licemnahoru + '}';
    }
}
