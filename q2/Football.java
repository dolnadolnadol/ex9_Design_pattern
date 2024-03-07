public class Football extends Game {

    @Override
    public void initializeGame() {
        System.out.println("Initializing football game");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing Football Game.");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the football game.");
    }
}
