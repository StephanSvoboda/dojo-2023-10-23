public enum ScoreNames {
    LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty");
    private final String value;

    ScoreNames(String name) {
        this.value = name;
    }

    static String fromScore(int score) {
        return values()[score].value;
    }

    // TODO fromValue, toValue
}
