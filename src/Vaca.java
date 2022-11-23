
public class Vaca extends Animal{
    //constructor
    public Vaca(int patas, String color, String altura, String peso) {
        super(patas, color, altura, peso);
    }

    @Override
    public void hablar() { 
        System.out.println("La vaca dice Muu");
    }

    @Override
    public void trabajo() {
        System.out.println("Cantidad de patas:" +patas);
           System.out.println("Color: "+color);
          System.out.println(altura);
          System.out.println(peso);
        System.out.println("Su trabajo es producir leche");
    }
    
}
