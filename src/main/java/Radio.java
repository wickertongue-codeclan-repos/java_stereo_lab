import java.util.ArrayList;


public class Radio extends Component {
    private ArrayList<Station> stations; // do we need this?

    public Radio(String make, String model) {
        super(make, model);
        this.stations = new ArrayList<Station>();
    }

    public String tune(Station station) {
        return station.getWelcomeMessage();
    }




}
