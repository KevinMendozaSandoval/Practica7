abstract public class Animal {
   protected int patas;
   protected String color,altura,peso;
   //constructor

    public Animal(int patas, String color, String altura, String peso) {
        this.patas = patas;
        this.color = color;
        this.altura = altura;
        this.peso = peso;
    }


   public int getPatas(){
       return patas;
   }
   
   public void setPatas(int patas){
       this.patas = patas;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

   
   
   //para mostrar el como hablan
   public void hablar(){
       
   }
   //para mostrar su trabjo
   public void trabajo(){
       
   }
   
}
