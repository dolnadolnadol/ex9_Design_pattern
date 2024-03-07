public class Context {
    private Game game;

    public Context(Game game) {
        this.game = game;
    }

    public void initialize() {
        game.initializeGame();
    }

    public void playing() {
        game.playingGame();
    }

    public void show() {
        game.showResult();
    }
}