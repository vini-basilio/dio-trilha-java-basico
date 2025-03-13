public class Operadores {
    public static void main(String[] args) throws Exception {

        int num = 5;
        // operador de negacao
        num = -num;
        // reverte a operação
        num = num * -1;
        // se o incrimento for assim
        // o valor sera impresso primeiro, e valor alterado depois
        System.out.println(num++);
        // agora o valor muda primeiro
        System.out.println(++num);
        // mesma logica para subtracao
    }
}
