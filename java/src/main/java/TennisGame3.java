import java.util.Objects;

public class TennisGame3 implements TennisGame {

    public static final int WINNING_THRESHOLD = 4;
    public static final int DEUCE_THRESHOLD = 3;
    private final Player player1;
    private final Player player2;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public String getScore() {
        if (player1.getScore() >= DEUCE_THRESHOLD && player1.getScore() == player2.getScore()) {
            return "Deuce";
        }

        if (player1.getScore() >= WINNING_THRESHOLD || player2.getScore() >= WINNING_THRESHOLD) {
            String winningPlayerName = player1.getScore() > player2.getScore() ? player1.getName() : player2.getName();
            return (Math.abs(player1.getScore() - player2.getScore()) == 1)
                    ? "Advantage " + winningPlayerName
                    : "Win for " + winningPlayerName;
        } else {
            String player1ScoreName = ScoreNames.fromScore(player1.getScore());
            return (player1.getScore() == player2.getScore())
                    ? player1ScoreName + "-All"
                    : player1ScoreName + "-" + ScoreNames.fromScore(player2.getScore());
        }
    }

    public void wonPoint(String playerName) {
        (Objects.equals(playerName, player1.getName()) ? player1 : player2).increaseScore();
    }

}
