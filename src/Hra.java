public class Hra {
    public static void main(String[] args) {
        StavHry stav=new StavHry(new String[]{"hrac1"});
        System.out.println(stav);
        stav.getLicemnahoru().vymenBalicky(stav.getLicemdolu());
        System.out.println(stav);

    }
}
