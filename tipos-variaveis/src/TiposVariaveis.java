public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int salarioMinimo = 2_500;
        System.out.println("Salário minímo: " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // casting
        short numeroCurto2 = (short) numeroNormal;

        // constante
        final float PI = 3.14F;

    }
}
