public class main {
    public static void main(String [] args) {
        soldierA p1 = new soldierA("Jahid","Juta",120);
        soldierB p2 = new soldierB("Ima","belain",90,false);
        System.out.println("Heath of "+p1.getName()+" is "+p1.getHealth());
        System.out.println("Heath of "+p2.getName()+" is "+p2.getHealth());

        System.out.println("<<<<<<<<<>>>>>>>>>\n");
        p1.damageSword();
        //p1.damageSword();
        p1.heal();
        p1.damageRifle();
        //p1.damageSword();
        //p1.heal();
        //p1.damageRifle();

        System.out.println("<<<<<<<<<>>>>>>>>>\n");
        p2.damageSword();
        p2.heal();
        //p2.damageSword();
        //p2.damageRifle();
        //p2.damageSword();
    }
}
