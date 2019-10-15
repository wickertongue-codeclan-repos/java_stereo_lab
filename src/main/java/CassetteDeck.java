public class CassetteDeck extends Component {
    private int cassetteNumber;

    public CassetteDeck(String make, String model, int cassetteNumber) {
        super(make, model);
        this.cassetteNumber = cassetteNumber;
    }

    public int getCassetteNumber() {
        return this.cassetteNumber;
    }

//    Play - from IPlay interface

//    Stop - from IStop

//    Forward

//    Rewind

}
