public class Cerchio extends Forma {
    private double raggio;

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * (raggio * raggio);
    }
}
