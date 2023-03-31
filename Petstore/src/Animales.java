public class Animales {
    private String Especie;
    private String Mame;
    private String color;
    private String rase;
    private String origin;

    //constructores

    public Animales(String especie, String mame, String color, String rase, String origin) {
        Especie = especie;
        Mame = mame;
        this.color = color;
        this.rase = rase;
        this.origin = origin;
    }


    //G & S


    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getMame() {
        return Mame;
    }

    public void setMame(String mame) {
        Mame = mame;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRase() {
        return rase;
    }

    public void setRase(String rase) {
        this.rase = rase;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
