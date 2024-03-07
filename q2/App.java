public class App {
    public static void main(String[] args) {
        Context context = new Context(new Football());
        context.initialize();
        context.playing();
        context.show();

        context = new Context(new Basketball());
        context.initialize();
        context.playing();
        context.show();
    }

}
