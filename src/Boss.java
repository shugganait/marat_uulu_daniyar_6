public class Boss extends GameEntity {
    public Boss(int health, int damage) {
        super(health, damage);
    }
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss || health: " + getHealth() + "\nBoss || damage: " + getDamage()
                + "\nBoss || weapon: " + weapon.getWeaponName() + "\nBoss || weaponType: " + weapon.getWeaponType().toString().toLowerCase());
    }
}
