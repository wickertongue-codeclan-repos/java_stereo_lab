public enum StationType {
    RADIO_ONE("You are listening to Radio One"),
    RADIO_TWO("You are listening to Radio Two"),
    RADIO_THREE("You are listening to Radio Three");


    private final String welcomeMessage;

    StationType(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

}
