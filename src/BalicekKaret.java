import java.util.ArrayList;

public class BalicekKaret  {
    private ArrayList<MariasovaKarta> balicek;
    private String druhBalicku;

    public BalicekKaret(String druhBalicku) {
        this.balicek =new ArrayList<>();
        this.druhBalicku=druhBalicku;
    }

    public ArrayList<MariasovaKarta> getBalicek() {
        return balicek;
    }

    public void pridejKartu(MariasovaKarta karta){
        balicek.add(karta);

    }

    public MariasovaKarta odeberKartu(){
        MariasovaKarta karta=balicek.get(balicek.size()-1);
        balicek.remove(karta);
        return karta;
    }
    public void vymenBalicky(BalicekKaret balicek2){
        if (balicek.size()>2){
            int size=balicek.size()-1;
            for (int i = 0; i < size; i++) {
                ArrayList<MariasovaKarta> licemdolu= balicek2.getBalicek();
                licemdolu.add(0, balicek.get(0));

                try {

                    balicek.remove(balicek.get(0));


                }catch (Exception e){
                    System.out.println(" prázdný baliček");
                    System.exit(2);
                }
        }


        }

    }



    @Override
    public String toString() {
        return druhBalicku   + balicek  ;
    }
}

