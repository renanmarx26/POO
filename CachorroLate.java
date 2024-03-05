public class CachorroLate{
    public static void main (String[] args){

        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Cachorro c3 = new Cachorro();

        c1.raca = "yorkshire";
        c1.tamanho = 90;
        c1.cor = "preto, beje e prateado";
        c1.tem_rabo = true;

        System.out.println("Eu sou o " + c1.raca + " de tamanho " + c1.tamanho + ", minha cor é " + c1.cor + " e eu tenho rabo.");

        c2.raca = "pastor alemão";
        c2.tamanho = 170;
        c2.cor = "preto e beje";
        c2.tem_rabo = true;

        System.out.println("Eu sou o " + c2.raca + " de tamanho " + c2.tamanho + ", minha cor é " + c2.cor + " e eu tenho rabo.");

        c3.raca = "lhasa apsu";
        c3.tamanho = 100;
        c3.cor = "beje";
        c3.tem_rabo = false;

        System.out.println("Eu sou o " + c3.raca + " de tamanho " + c3.tamanho + ", minha cor é " + c3.cor + " e eu não tenho rabo.");


    }
}