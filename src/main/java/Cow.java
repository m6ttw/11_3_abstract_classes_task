public class Cow extends FarmAnimal{
    private String noise;
    private String breed;

    public Cow(String species, String noise, String breed){
        super(species);
        this.noise = noise;
        this.breed = breed;
    }

    public String makeANoise(){
        return noise;
    }

    public String getBreed(){
        return this.breed;
    }

    public String introduceYourself(String species, String noise, String breed){
        return "Hi, I am a " + species + " of the " + breed + " family, " + noise + " " + noise;
    }
}
