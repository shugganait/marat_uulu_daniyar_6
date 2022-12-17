public class Skeleton extends Boss{
    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton || health: " + getHealth() + "\nSkeleton || damage: " + getDamage()
                + "\nSkeleton || weapon: " + weapon.getWeaponName() + "\nSkeleton || weaponType: "
                + weapon.getWeaponType().toString().toLowerCase().replace("_", " "));
    }

    private int amountOfArrows;

    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }
}
