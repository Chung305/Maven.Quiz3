package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK", "SCISSOR", "PAPER"), PAPER("PAPER", "ROCK", "SCISSOR"), SCISSOR("SCISSOR", "PAPER", "ROCK");
    private String value;
    private String wins;
    private String loses;

    RockPaperScissorHandSign(String value, String wins, String loses){
        this.value = value;
        this.wins = wins;
        this.loses = loses;
    }

    public RockPaperScissorHandSign getWinner() {
        return this.valueOf(loses);
    }

    public RockPaperScissorHandSign getLoser() {
        return this.valueOf(wins);
    }
}
