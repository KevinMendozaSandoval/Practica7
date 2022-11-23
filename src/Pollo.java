public class Pollo extends Animal{
    //constructor

    
    public Pollo(int patas, String color, String altura, String peso) {
        super(patas, color, altura, peso);
    }

    @Override
    public void hablar() {
        System.out.println("El gallo kikirikea");
    }

    @Override
    public void trabajo() {
        System.out.println("Cantidad de patas:" +patas);
          System.out.println("Color: "+color);
          System.out.println(altura);
          System.out.println(peso);
        System.out.println("Su trabajo es cuidar el rancho y de las gallinas poner huevos");
    }
    

    
}