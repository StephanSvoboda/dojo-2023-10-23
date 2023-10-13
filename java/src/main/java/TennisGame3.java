
public class TennisGame3 implements TennisGame {

    private final Player player1;
    private final Player player2;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public String getScore() {
        String s;
        if (player1.getScore() < 4 && player2.getScore() < 4 && !(player1.getScore() + player2.getScore() == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[player1.getScore()];
            return (player1.getScore() == player2.getScore()) ? s + "-All" : s + "-" + p[player2.getScore()];
        } else {
            if (player1.getScore() == player2.getScore())
                return "Deuce";
            s = player1.getScore() > player2.getScore() ? player1.getName() : player2.getName();
            return ((player1.getScore() - player2.getScore())*(player1.getScore() - player2.getScore()) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1.score = this.player1.score + 1;
        else
            this.player2.score = this.player2.score + 1;
        
    }

}
