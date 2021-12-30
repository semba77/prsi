public class MariasovaKarta implements Karta{
    String barva;
    String hodnota;

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public String getHodnota() {
        return hodnota;
    }

    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }

    public MariasovaKarta(String barva, String hodnota) {
        this.barva = barva;
        this.hodnota = hodnota;
    }

    public boolean jePlatnaKarta(MariasovaKarta karta) {

        if (jeLizacKarta()) {

            if (jeStejnaKarta(new MariasovaKarta("listy","kral")) &&
                    !karta.jeStejnaKarta(new MariasovaKarta("listy","sedma")))
                return false;

            if (jeStejnaKarta(new MariasovaKarta("listy","sedma"))&&
                    !karta.jeStejnaKarta(new MariasovaKarta("listy","kral")) &&
                    !karta.jeStejnaHodnota("sedma"))
                return false;

            if (jeStejnaHodnota("sedma")&& !karta.jeStejnaHodnota("sedma"))
                return false;
        }


        return jeStejnaHodnota(karta.getHodnota()) || jeStejnaBarva(karta.getBarva());
    }

    public boolean jeLizacKarta(){
        return kolikBeres()>0;

    }

    public int kolikBeres(){

        if (jeStejnaKarta(new MariasovaKarta("listy","kral")))
            return 4;

        if (jeStejnaHodnota("sedma"))
            return 2;
        return 0;
    }

    public boolean jeStejnaBarva(String barva){
        return getBarva().equals(barva);
    }

    public boolean jeStejnaHodnota(String hodnota){
        return getHodnota().equals(hodnota);
    }

    public boolean jeStejnaKarta(MariasovaKarta karta){
        return jeStejnaHodnota(karta.getHodnota()) && jeStejnaBarva(karta.getBarva());
    }




    @Override
    public String toString() {
        return  '(' + barva + ' ' + hodnota + ')'+", " ;
    }
}
