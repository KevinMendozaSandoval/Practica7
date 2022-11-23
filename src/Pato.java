public class Pato extends Animal{
    //constructor
    
    public Pato(int patas, String color, String altura, String peso) {
        super(patas, color, altura, peso);
    }

    @Override
    public void hablar() {
        System.out.println("El pato grazna");
    }

    @Override
    public void trabajo() {
        System.out.println("Cantidad de patas:" +patas);
        System.out.println("Color: "+color);
          System.out.println(altura);
          System.out.println(peso);
        System.out.println("Su trabajo es morder niños");
    }

    
}