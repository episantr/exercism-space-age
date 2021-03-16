public class SpaceAge {

    private final double seconds;

    private final double aYearOnEarth = 31557600;
    private final double aYearOnMercury = aYearOnEarth * 0.2408467;
    private final double aYearOnVenus = aYearOnEarth * 0.61519726;
    private final double aYearOnMars = aYearOnEarth * 1.8808158;
    private final double aYearOnJupiter = aYearOnEarth * 11.862615;
    private final double aYearOnSaturn = aYearOnEarth * 29.447498;
    private final double aYearOnUranus = aYearOnEarth * 84.016846;
    private final double aYearOnNeptune = aYearOnEarth * 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return seconds / aYearOnEarth;
    }

    double onMercury() {
        return seconds / aYearOnMercury;
    }

    double onVenus() {
        return seconds / aYearOnVenus;
    }

    double onMars() {
        return seconds / aYearOnMars;
    }

    double onJupiter() {
        return seconds / aYearOnJupiter;
    }

    double onSaturn() {
        return seconds / aYearOnSaturn;
    }

    double onUranus() {
        return seconds / aYearOnUranus;
    }

    double onNeptune() {
        return seconds / aYearOnNeptune;
    }
}
