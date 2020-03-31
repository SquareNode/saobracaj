public class Auto extends Vozila implements Voznja, KriticnaSituacija{

    private String marka, model, godiste;
    private int V, brSed;

    public Auto(String marka, String model, String godiste, int V, int brSed) {
        this.brSed = brSed;
        this.godiste = godiste;
        this.marka = marka;
        this.model = model;
        this.V = V;
        spremiSe();
    }

    public Auto(Auto x) {
        marka = x.marka;
        model = x.model;
        godiste = x.godiste;
        V = x.V;
        brSed = x.brSed;
    }

    public int getV() {
        return V;
    }

    public int getBrSed() {
        return brSed;
    }

    public String getGodiste() {
        return godiste;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setBrSed(int brSed) {
        this.brSed = brSed;
    }

    public void setGodiste(String godiste) {
        this.godiste = godiste;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setV(int v) {
        V = v;
    }

    @Override
    public void kreciSe() {
        System.out.println("Auto " + marka + " se krece!");
    }

    @Override
    public void kreni() {
        System.out.println("Auto " + marka + " je krenuo!");
        ubrzaj();
    }

    @Override
    public void stani() {
        uspori();
        System.out.println("Auto " + marka + " staje!");
    }

    @Override
    public int nekiKoef() {
        return 0;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godiste='" + godiste + '\'' +
                ", V=" + V +
                ", brSed=" + brSed +
                '}';
    }

    @Override
    public void spremiSe() {
        System.out.println("Vozac u autu " + marka + " je vezao pojas!");
    }

    @Override
    public void ubrzaj() {
        System.out.println("Auto " + marka + " ubrzava!");
    }

    @Override
    public void uspori() {
        System.out.println("Auto " + marka + " usporava!");
    }

    @Override
    public void kriticnaSituacija() {
        System.out.println("Auto " + marka + " naglo koci!");
        stani();
    }
}
