public class Circulo {

    double raio;


    void raio_area(double numero_raio){
        raio = 3.14 * Math.pow(numero_raio,2);
        System.out.println("Sua área é de: " + raio);
    }

    void raio_perimetro(double numero_raio){
        raio = 2 * 3.14 * numero_raio;
    }
}
