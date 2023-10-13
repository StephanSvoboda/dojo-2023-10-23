
public class TennisGame3 implements TennisGame {

    private final Player player1;
    private final Player player2;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public String getScore() {
        String s;
        if (player1.score < 4 && player2.score < 4 && !(player1.score + player2.score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[player1.score];
            return (player1.score == player2.score) ? s + "-All" : s + "-" + p[player2.score];
        } else {
            if (player1.score == player2.score)
                return "Deuce";
            s = player1.score > player2.score ? player1.name : player2.name;
            return ((player1.score - player2.score)*(player1.score - player2.score) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1.score = this.player1.score + 1;
        else
            this.player2.score = this.player2.score + 1;
        
    }

}
