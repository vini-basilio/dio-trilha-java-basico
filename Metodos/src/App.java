public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.mudarDeCanal(75);
        smartTv.aumentarCanal();
    }
}
