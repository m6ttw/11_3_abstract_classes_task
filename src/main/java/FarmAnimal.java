public abstract class FarmAnimal {
    private String species;

    public FarmAnimal(String species){
        this.species = species;
    }

    public String getSpecies(){
        return this.species;
    }

    public String introduceYourself(String species){
        return String.format("Hi, I am a %s", species);
    }

    public abstract String makeANoise();
}
