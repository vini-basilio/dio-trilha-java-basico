public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try {
            FormatadorDeCep.formatarCep("12345678");

        } catch (CepInvalidoException e) {
            // TODO: handle exception
        }
    }
}
