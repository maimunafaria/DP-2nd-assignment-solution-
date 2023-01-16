public class BoosterMode extends PrintMode{
    public double intensityThreshold;

    public BoosterMode() {
    }

    public BoosterMode(double intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }


    public void boost() {
        setColorIntensity(intensityThreshold);
    }
}
