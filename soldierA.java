public class soldierA {
    private String name;
    private String weapon;
    private int health;

    public soldierA(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health<0 || health >100) this.health = 100;
        else this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Reduce health by 30
    public void damageSword(){
        if(this.health>0) {
            this.health -= 30;
            if (this.health < 0) this.health = 0;
            System.out.println(this.getName() + " got hit by " + this.getWeapon() + "\nHealth reduced: 30.\nRemaining Health: " + this.health);
            if (this.health == 0) System.out.println(this.getName() + " is no more.");
        }
        else {
            System.out.println(this.getName()+" is already dead.");
        }
    }

    // Reduce health by 50
    public void damageRifle(){
        if(this.health>0) {
            this.health -= 40;
            if (this.health < 0) this.health = 0;
            System.out.println(this.getName() + " got hit by " + this.getWeapon() + "\nHealth reduced: 40.\nRemaining Health: " + this.health);
            if (this.health == 0) System.out.println(this.getName() + " is no more.");
        }
        else {
            System.out.println(this.getName()+" is already dead.");
        }
    }

    public void heal(){
        if (this.health>0 && this.health<100 ) {
            if((this.health+20) >100){
                this.health=100;
            }
            else {
                this.health += 20;
            }
            System.out.println(this.getName() + " was healed.\nNew Heath: "+this.health);
        }
        else if(this.health>=100) System.out.println("Health is full");
        else if(this.health==0) System.out.println("Cannot bring back a dead guy!!!!");
    }
}
