public class Vibora extends Animal{
    //constructor
 
    public Vibora(int patas, String color, String altura, String peso) { 
        super(patas, color, altura, peso);
    }

    @Override
    public void hablar() { 
        System.out.println("La vibora sisea");
    }

    @Override
    public void trabajo() {
        System.out.println("No tiene patas");
           System.out.println("Color: "+color);
          System.out.println(altura);
          System.out.println(peso);
        System.out.println("Su trabajo es matarme el ganado");
    }
    
    
}
