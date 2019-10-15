public class Station {
    private StationType stationName;

    public Station(StationType stationName) {
        this.stationName = stationName;
    }

    public StationType getStationType() {
        return this.stationName;
    }

    public String getWelcomeMessage() {
        return this.stationName.getWelcomeMessage();
    }
}
