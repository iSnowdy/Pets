package Build;

public class Parrot extends Birds {
    private String origin;
    private boolean talks;

    public Parrot(String petName, int petAge, String dateOfBirth, boolean beck, boolean flier, String origin, boolean talks) {
        super(petName, petAge, dateOfBirth, beck, flier);
        this.origin = origin;
        this.talks = talks;
    }

    @Override
    public void showPet() {
        System.out.println("Name: " + this.getPetName());
        System.out.println("Age: " + this.getPetAge());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        // System.out.println("Status: " + Status.ALIVE.display());
        System.out.println("Parrot Origin: " + this.getOrigin());
        System.out.println("Does it fly? " + this.isFlier());
        System.out.println("Does the Parrot have a beak? " + this.isBeak());
        System.out.println("Does the Parrot talk? " + this.isTalks());
    }

    @Override
    public void speak() {
        System.out.println("Do Katas! Do Katas!");
    }

    @Override
    public void fly() {
        System.out.println("Now I fly");
        // Status change to flying
    }

    public void greets() {
        System.out.println("Hello there Stranger");
    }

    // Getters and Setters
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isTalks() {
        return talks;
    }

    public void setTalks(boolean talks) {
        this.talks = talks;
    }
}
