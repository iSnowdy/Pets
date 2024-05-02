package Build;

public class Canary extends Birds {
    private String color;
    private boolean sings;

    public Canary(String petName, int petAge, String dateOfBirth, boolean beck, boolean flier, String color, boolean sings) {
        super(petName, petAge, dateOfBirth, beck, flier);
        this.color = color;
        this.sings = sings;
    }

    @Override
    public void showPet() {
        System.out.println("Name: " + this.getPetName());
        System.out.println("Age: " + this.getPetAge());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        // System.out.println("Status: " + Status.ALIVE.display());
        System.out.println("Does it fly? " + this.isFlier());
        System.out.println("Does the Canary have a beak? " + this.isBeak());
        System.out.println("Canary's Color: " + this.getColor());
        System.out.println("Does the Canary Sing? " + this.isSings());
    }

    @Override
    public void speak() {
        System.out.println("Pio pio");
    }

    @Override
    public void fly() {
        System.out.println("Fly birdie fly");
        // Status change to flying
    }


    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSings() {
        return sings;
    }

    public void setSings(boolean sings) {
        this.sings = sings;
    }
}
