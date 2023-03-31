public class PetStore {
    public static void main(String[] args) {

        cat cat = new cat("Felino", "Gary", "Naranja atigrado","No se sabe","Mexico");
        dog dog = new dog("canino","Guau Guau","Basenji","Naranja con blanco","Venezuela");


  System.out.println("Gato: \n"  + "Especie:" + "  " +  cat.getEspecie()+ "\n" + "Name:" + " " +  cat.getMame() +"\n" + "Colo:  " + cat.getColor() +"\n"+ "Rasa:  " +  cat.getRase()+"\n"  + "Origen  "+ cat.getOrigin() + "\n");
 cat.sonido();
        System.out.println(cat.sonido());

        dog.Sonido();
        System.out.println(dog.Sonido());

        System.out.println("Perro:\n"  + "Especie: " + dog.getEspecie()+"\n" + "Nombre: " + dog.getMame() + "\n" + "Color: " + dog.getColor() + "\n" +"Rasa: " + dog.getRase() + "\n" + "Origen: " + dog.getOrigin());
///No sale los sonidos :(
    }
}
