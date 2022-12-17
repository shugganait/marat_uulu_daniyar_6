public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1200,80);
        boss.setHealth(1200);
        boss.setDamage(80);
        boss.weapon.setWeaponName("bow");
        boss.weapon.setWeaponType(WeaponType.BOW);
        System.out.println("Boss || health: " + boss.getHealth() + "\nBoss || damage: " + boss.getDamage()
                + "\nBoss || weapon: " + boss.weapon.getWeaponName() + "\nBoss || weaponType: " + boss.weapon.getWeaponType().toString().toLowerCase());


        System.out.println("_____________________________");
        boss.printInfo();


        System.out.println("_____________________________");
        Skeleton skeleton = new Skeleton(100, 20);
        skeleton.setHealth(100);
        skeleton.setDamage(20);
        skeleton.weapon.setWeaponName("Атомная бомба Ким Чен Ына");
        skeleton.weapon.setWeaponType(WeaponType.NUCLEAR_WEAPON);
        skeleton.printInfo();


        System.out.println("____________________________");
        Skeleton skeleton2 = new Skeleton(120, 25);
        skeleton2.setHealth(120);
        skeleton2.setDamage(25);
        skeleton2.weapon.setWeaponName("Миномет 2Б9'Санёк'");
        skeleton2.weapon.setWeaponType(WeaponType.AUTOMATIC_WEAPON);
        skeleton2.printInfo();
        // ахахахах прикольно, у босса лук, а у скелетов атомная бомба и миномет
    }
}
