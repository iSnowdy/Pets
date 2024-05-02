package Build;

public abstract class Birds extends Pets {
    private boolean beak;
    private boolean flier;

    public Birds (String petName, int petAge, String dateOfBirth, boolean beak, boolean flier) {
        super(petName, petAge, dateOfBirth);
        this.beak = beak;
        this.flier = flier;
    }

    public abstract void fly();

    // Getters and Setters
    public boolean isBeak() {
        return beak;
    }

    public void setBeak(boolean beak) {
        this.beak = beak;
    }

    public boolean isFlier() {
        return flier;
    }

    public void setFlier(boolean flier) {
        this.flier = flier;
    }
}
