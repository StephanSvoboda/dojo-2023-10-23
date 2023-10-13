public class ScoreNames {
    public static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};


    static String getScoreName(int score) {
        return Names.values()[score].value;
    }
    private enum Names{
        LOVE("Love"), FIFTEEN("Fifteen"), THIRTY("Thirty"), FORTY("Forty");
        private final String value;

        Names(String name) {
            this.value = name;
        }

        // TODO fromValue, toValue
    }
}