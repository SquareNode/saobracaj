public class Motor extends Vozila implements Voznja, KriticnaSituacija{
    private String marka, tip, godiste;
    private int V, maxv;

    public Motor(String marka, String tip, String godiste, int V, int maxv) {
        this.marka = marka;
        this.tip = tip;
        this.godiste = godiste;
        this.V = V;
        this.maxv = maxv;
        spremiSe();
    }
    public Motor(Motor x) {
        marka = x.marka;
        tip = x.tip;
        godiste = x.godiste;
        V = x.V;
        maxv = x.maxv;
        spremiSe();
    }

    public String getMarka() {
        return marka;
    }

    public String getGodiste() {
        return godiste;
    }

    public int getV() {
        return V;
    }

    public int getMaxv() {
        return maxv;
    }

    public String getTip() {
        return tip;
    }

    public void setV(int v) {
        V = v;
    }

    public void setGodiste(String godiste) {
        this.godiste = godiste;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setMaxv(int maxv) {
        this.maxv = maxv;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void kreciSe() {
        System.out.println("Motor " + marka + " se krece!");
    }

    @Override
    public void kreni() {
        System.out.println("Motor " + marka + " je krenuo!");
        ubrzaj();
    }

    @Override
    public void stani() {
        uspori();
        System.out.println("Motor " + marka + " staje!");
    }
    @Override
    public int nekiKoef() {
        return 0;
    }

    @Override
    public void spremiSe() {
        System.out.println("Vozac motora "+ marka +" je stavio kacigu!");
    }

    @Override
    public void ubrzaj() {
        System.out.println("Motor "+ marka + "ubrzava!");
    }

    @Override
    public void uspori() {
        System.out.println("Motor "+ marka + "usporava!");
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marka='" + marka + '\'' +
                ", tip='" + tip + '\'' +
                ", godiste='" + godiste + '\'' +
                ", V=" + V +
                ", maxv=" + maxv +
                '}';
    }

    @Override
    public void kriticnaSituacija() {
        System.out.println("Motor " + marka + " naglo koci!");
        stani();
    }
}
