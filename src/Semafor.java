import java.util.Arrays;

public class Semafor extends Saobracaj{

    private Svetlo v,p;
    private Vozila[] red_vozila;
    private Pesak[] red_pesaka;
    public Semafor(Vozila[] red_vozila, Pesak[] red_pesaka){
        setV(Svetlo.odBroja(0));
        setP(Svetlo.odBroja(3));
        this.red_pesaka = red_pesaka;
        this.red_vozila = red_vozila;
    }

    public Pesak[] getRed_pesaka() {
        return red_pesaka;
    }

    public Svetlo getP() {
        return p;
    }

    public Svetlo getV() {
        return v;
    }

    public Vozila[] getRed_vozila() {
        return red_vozila;
    }

    public void setV(Svetlo v) {
        this.v = v;
    }

    public void setP(Svetlo p) {
        this.p = p;
    }

    public void setRed_pesaka(Pesak[] red_pesaka) {
        this.red_pesaka = red_pesaka;
    }

    public void setRed_vozila(Vozila[] red_vozila) {
        this.red_vozila = red_vozila;
    }

    @Override
    public void kreciSe() {
        if(v == Svetlo.V_CRVENO && p == Svetlo.P_ZELENO)
            System.out.println("Pesaci mogu da predju ulicu!");
        else if(v == Svetlo.V_ZELENO && p == Svetlo.P_CRVENO)
            System.out.println("Vozila mogu da krenu!");
        else
            System.out.println("Cekajte!");

    }

    @Override
    public void kreni() {
        if(v == Svetlo.V_ZELENO)
            System.out.println("Vozila mogu da krenu!");
        if(p == Svetlo.P_ZELENO)
            System.out.println("Pesaci mogu da krenu!");
    }

    @Override
    public void stani() {
        if(v == Svetlo.V_ZUTO)
            System.out.println("Vozila usporite!");
        if(v == Svetlo.V_CRVENO)
            System.out.println("Vozila stanite!");
        if(p == Svetlo.P_CRVENO)
            System.out.println("Pesaci stanite!");

    }

    @Override
    public String toString() {
        return "Semafor{" +
                "v=" + v +
                ", p=" + p +
                ", red_vozila=" + Arrays.toString(red_vozila) +
                ", red_pesaka=" + Arrays.toString(red_pesaka) +
                '}';
    }
}
