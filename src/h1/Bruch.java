package h1;

public class Bruch {
    public int zaehler, nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        int dividend = Math.abs(x);
        int divisor = Math.abs(y);
        if (dividend == 0) {
            return divisor;
        }
        int rest = -1;
        while (rest != 0) {
            rest = dividend % divisor;
            if (rest != 0) {
                dividend = divisor;
                divisor = rest;
            }
        }
        return divisor;
    }

    public void shorten() {
        int ggt = ggT(zaehler, nenner);
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;
    }

    public boolean hasSameValueAs(Bruch b) {
        return (this.zaehler * b.nenner) == (this.nenner * b.zaehler);
    }
}
