public enum Svetlo {

    V_CRVENO(0),
    V_ZUTO(1),
    V_ZELENO(2),
    P_CRVENO(3),
    P_ZELENO(4);

    private final int x;

    public static Svetlo odBroja(int i) {
        switch(i) {
            case 0: return V_CRVENO;
            case 1: return V_ZUTO;
            case 2: return V_ZELENO;
            case 3: return P_CRVENO;
            case 4: return P_ZELENO;
            default:
                throw new Error("nepoznato svetlo");
        }
    }

    private Svetlo(int x) {
        this.x = x;
    }
}
