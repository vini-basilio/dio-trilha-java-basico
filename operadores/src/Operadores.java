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

        // operadores comparam tipos e tipos primitivos
        // para comparar conteudo de objetos

        String nomeUm = "Meu nome";
        String nomeDois = "Meu nome";
        String nomeTres = "Meu nome diferente";
        System.out.println(nomeUm.equals(nomeDois));
        System.out.println(nomeUm.equals(nomeTres));
    }
}
