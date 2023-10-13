
public class TennisGame3 implements TennisGame {

    private final Player player1 = new Player();
    private final Player player2 = new Player();

    public TennisGame3(String player1Name, String player2Name) {
        this.player1.player1Name = player1Name;
        this.player2.player1Name = player2Name;
    }

    public String getScore() {
        String s;
        if (player1.player1Score < 4 && player2.player1Score < 4 && !(player1.player1Score + player2.player1Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[player1.player1Score];
            return (player1.player1Score == player2.player1Score) ? s + "-All" : s + "-" + p[player2.player1Score];
        } else {
            if (player1.player1Score == player2.player1Score)
                return "Deuce";
            s = player1.player1Score > player2.player1Score ? player1.player1Name : player2.player1Name;
            return ((player1.player1Score - player2.player1Score)*(player1.player1Score - player2.player1Score) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1.player1Score = this.player1.player1Score + 1;
        else
            this.player2.player1Score = this.player2.player1Score + 1;
        
    }

}
