package Build;

import jdk.jshell.Snippet;

public class Dog extends Pets {
    private String breed;
    private int ticks;

    public Dog(String petName, int petAge, String dateOfBirth) {
        super(petName, petAge, dateOfBirth);
        this.breed = breed;
        this.ticks = ticks;
    }

    @Override
    public void showPet() {
        System.out.println("Name: " + this.getPetName());
        System.out.println("Age: " + this.getPetAge());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        // System.out.println("Status: " + Status.ALIVE.display());
        System.out.println("Dog's breed: " + this.getBreed());
        System.out.println("How many ticks does the dog have? " + this.getTicks());
    }

    @Override
    public void speak() {
        System.out.println("Guau guau");
    }

    // Getters and Setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getTicks() {
        return ticks;
    }

    public void setTicks(int ticks) {
        this.ticks = ticks;
    }
}
