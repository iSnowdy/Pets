package Build;

public class Cat extends Pets {
    private String catColor;
    private boolean longHair;

    public Cat(String petName, int petAge, String dateOfBirth, String catColor, boolean longHair) {
        super(petName, petAge, dateOfBirth);
        this.catColor = catColor;
        this.longHair = longHair;
    }

    @Override
    public void showPet() {
        System.out.println("Name: " + this.getPetName());
        System.out.println("Age: " + this.getPetAge());
        System.out.println("Date of Birth: " + this.getDateOfBirth());
        // System.out.println("Status: " + Status.ALIVE.display());
        System.out.println("Cat's color: " + this.getCatColor());
        System.out.println("Is the cat's hair long? " + this.isLongHair());
    }

    @Override
    public void speak() {
        System.out.println("Miau");
    }

    // Getters and Setters
    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    public boolean isLongHair() {
        return longHair;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }


}
