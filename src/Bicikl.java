public class Bicikl extends Vozila implements Voznja {

    private String marka;
    private int maxV, brServisa;
    private boolean kolovoz;

    public Bicikl(String marka, int maxV, int brServisa, boolean kolovoz) {
        this.marka= marka;
        this.maxV = maxV;
        this.brServisa = brServisa;
        this.kolovoz = kolovoz;
        spremiSe();
    }

    public Bicikl(Bicikl x) {
        marka = x.marka;
        maxV = x.maxV;
        brServisa = x.brServisa;
        kolovoz = x.kolovoz;
    }

    public String getMarka() {
        return marka;
    }

    public int getBrServisa() {
        return brServisa;
    }

    public int getMaxV() {
        return maxV;
    }
    public boolean getKolovoz() {
        return kolovoz;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setBrServisa(int brServisa) {
        this.brServisa = brServisa;
    }

    public void setKolovoz(boolean kolovoz) {
        this.kolovoz = kolovoz;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    @Override
    public void kreciSe() {
        System.out.println("Bicikl " + marka + " se krece!");
    }

    @Override
    public void kreni() {
        System.out.println("Bicikl "+ marka + " je krenuo!");
        ubrzaj();
    }

    @Override
    public void stani() {
        uspori();
        System.out.println("Bicikl + "+ marka + " je stao!");
    }

    @Override
    public int nekiKoef() {
        return 0;
    }

    @Override
    public void spremiSe() {
        System.out.println("Vozac bicikla " + marka  + " je stavio kacigu!");
    }

    @Override
    public void ubrzaj() {
        System.out.println("Bicikl " + marka + " ubrzava!");
    }

    @Override
    public void uspori() {
        System.out.println("Bicikl " + marka + " usporava!");
    }

    @Override
    public String toString() {
        return "Bicikl{" +
                "marka='" + marka + '\'' +
                ", maxV=" + maxV +
                ", brServisa=" + brServisa +
                ", kolovoz=" + kolovoz +
                '}';
    }
}
