package Gun49.task1;

public class Kare extends Dikdortgen {

    public Kare(double genislik) {
        super(genislik, genislik);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "Alan =" + getAlan() +
                ", Cevre =" + getCevre() +
                '}';
    }
}
