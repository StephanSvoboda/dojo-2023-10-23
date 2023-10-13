public class ScoreNames {
    public static final String[] SCORE_NAMES = {"Love", "Fifteen", "Thirty", "Forty"};


    static String getScoreName(int score) {
        if(score == 0){
            return Names.values()[score].value;
        }
        return SCORE_NAMES[score];
    }
    private enum Names{
        LOVE("Love");
        private final String value;

        Names(String name) {
            this.value = name;
        }

        // TODO fromValue, toValue
    }
}