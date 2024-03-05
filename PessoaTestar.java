public class PessoaTestar{

    public static void main (String[] args){

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Renan";
        p1.idade = 22;
        p1.cidade = "Belo Horizonte";

        System.out.println("Seu nome é " + p1.nome + ", sua idade é " + p1.idade + " e você é da cidade " + p1.cidade);

        p2.nome = "Catia";
        p2.idade = 40;
        p2.cidade = "Cancun";

        System.out.println("Seu nome é " + p2.nome + ", sua idade é " + p2.idade + " e você é da cidade " + p2.cidade);
    }
}