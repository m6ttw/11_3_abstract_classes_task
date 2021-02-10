public class Duck extends FarmAnimal {
    private String noise;


    public Duck(String species, String noise){
        super(species);
        this.noise = noise;

    }

    public String makeANoise(){
        return noise;
    }

    public String introduceYourself(String species, String noise){
        return "Hi, I am a " + species + ", " + noise + " " + noise;
    }
}
