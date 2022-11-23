
import java.util.Random;

public class Granja {

    enum Animales {
        PATO,
        POLLO,
        VACA,
        VIBORA;
    }
   
    public static void main(String[] args) {
        Random num = new Random();

        //Mi ranchito donde guardo animales
        Animal miRancho[] = new Animal[15];

        //crear con las enumeraciones
        for (int i = 0; i < miRancho.length; i++) {
            Animales animal= tipoAnimal(num.nextInt(4));
           //crea el animal aleatoriamente
            switch (animal) {
                case VACA:
                    miRancho[i] = new Vaca(4,"Negro y Blanco","Altura de 1.50 metros de altura y unos 2.60 metros de largo aprox","Peso Promedio: entre 550 y 650 kg");
                    break;
                case PATO:
                    miRancho[i] = new Pato(2,"Blanco","Altura de 20 a 25 cm aprox","Peso Promedio: entre 3,6 y 4,1 kg");
                    break;
                case POLLO:
                    miRancho[i] = new Pollo(2,"Cafe, Negro y Rojo","Altura de aproximadamente 50 cm","Peso Promedio: entre 4 a 5 kg");
                    break;
                case VIBORA:
                    miRancho[i] = new Vibora(0,"Verde","Longitud: Más de 90 cm","Peso Promedio: entre 50 g y 180 g aproximadamente");
                    break;
                default:
                    break;
            }
        }
        //muestra los animales, como hablan y su trabajo
        for (int i = 0; i < miRancho.length; i++) {
            miRancho[i].hablar();
            miRancho[i].trabajo();
            System.out.println("\n");
        }
                
    }

    public static Animales tipoAnimal(int num) {
        Animales animal = Animales.VACA;
        switch (num) {
            case 0:
                animal = Animales.VACA;
                break;
            case 1:
                animal = Animales.PATO;
                break;
            case 2:
                animal = Animales.POLLO;
                break;
            case 3:
                animal = Animales.VIBORA;
                break;
        }
        return animal;
    }
}