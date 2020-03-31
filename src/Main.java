public class Main {
    public static void main(String[] args) {
        Auto audi = new Auto("audi", "a6", "2012", 1000, 5);
        Auto bmw = new Auto("bmw", "x7", "2015", 2000, 5);
        Auto smart = new Auto("smart", "ForTwo", "2009", 500, 2);

        Motor harli = new Motor("harli", "opasan", "2005", 500, 250);

        Bicikl bajs = new Bicikl("capriolo", 30, 5, true);

        Vozila[] v = new Vozila[5];
        //v = {audi,bmw,smart,harli, bajs};
        v[0] = audi;
        v[1] = bmw;
        v[2] = smart;
        v[3] = harli;
        v[4] = bajs;

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        Pesak marko = new Pesak("Marko", 25);
        Pesak pera = new Pesak("Pera", 34);
        Pesak ana = new Pesak("Ana", 29);

        Pesak[] p = new Pesak[3];
        //p = {marko, pera, ana}
        p[0] = marko;
        p[1] = pera;
        p[2] = ana;

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        Semafor sem = new Semafor(v,p);
        System.out.println(sem);
        sem.setP(Svetlo.P_ZELENO);
        System.out.println(sem);

    }
}
