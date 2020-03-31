public class Pesak extends Saobracaj implements KriticnaSituacija{

    private String ime;
    private int godine;

    public Pesak(String ime, int godine) {
        this.godine = godine;
        this.ime = ime;
    }

    public Pesak(Pesak p) {
        ime = p.ime;
        godine = p.godine;
    }

    public String getIme() {
        return ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    @Override
    public void kreciSe() {
        System.out.println("Pesak " + ime + " se krece!");
    }

    @Override
    public void kreni() {
        System.out.println("Pesak " + ime + " je krenuo!");
    }

    @Override
    public void stani() {
        System.out.println("Pesak " + ime + " staje!");

    }

    @Override
    public void kriticnaSituacija() {
        System.out.println("Pesak " + ime + " trci!");
    }

    @Override
    public String toString() {
        return "Pesak{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                '}';
    }
}
