public class Player {
    int score = 0;
    private final String name;

    public Player(String playerName) {
        this.name = playerName;
    }


    int getScore() {
        return score;
    }

    String getName() {
        return name;
    }

}