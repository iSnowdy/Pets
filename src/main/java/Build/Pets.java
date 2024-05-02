package Build;

import java.util.Objects;

public abstract class Pets {
    private String petName;
    private int petAge;
    private String dateOfBirth;
    private enum Status { // Enum type for the pet status
        ALIVE,
        DEAD,
        SICK;

        public void display() {
            System.out.println("The pet status is: " + this);
        }
    }

    public Pets(String petName, int petAge, String dateOfBirth) {
        this.petName = petName;
        this.petAge = petAge;
        this.dateOfBirth = dateOfBirth;
    }

    public void showPet() {
        System.out.println("Name: " + this.getPetName());
        System.out.println("Age: " + this.getPetAge());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        // System.out.println("Status: " + Status.ALIVE.display());
    }
    public abstract void speak();

    public void death() {

    }

    public String happyBirthday() {
        this.petAge = this.petAge + 1;

        String output = "Happy birthday!";
        return output;
    }

    // Getters and Setters
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void die() {
        Status dead = Status.DEAD;
        System.out.println("The pet is dead now");
    }

    // Possible logic failure
    public void setStatus(String status) {
        Status alive = Status.ALIVE;
        Status dead = Status.DEAD;
        Status sick = Status.SICK;

        if (Objects.equals(alive, status)) {
            System.out.println("The pet is ALIVE");
        } else if (Objects.equals(dead, status)) {
            System.out.println("The pet is DEAD");

        } else if (Objects.equals(sick, sick)) {
            System.out.println("The pet is SICK");
        } else {
            System.out.println("Invalid pet status");
        }
    }
}
