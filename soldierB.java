public class soldierB extends soldierA {
    private int  health;
    private boolean shield;

    public soldierB(String name,String weapon ,int health, boolean shield) {
        super(name,weapon,health);
        this.health = health;
        this.shield = shield;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public void damageSword(){
        if(shield && this.health>0){
            this.health -=20;
            if(this.health <0) this.health = 0;
            System.out.println(this.getName()+" have a shield\n"+this.getName()+" got hit by "+this.getWeapon()+"\nHealth reduced: 20.\nRemaining Health: "+this.health);
            if(this.health == 0) System.out.println(this.getName()+" is no more.");
        }
        else if(!shield && this.health>0){
            this.health -=30;
            if(this.health <0) this.health = 0;
            System.out.println(this.getName()+" doesn't have a shield\n"+this.getName()+" got hit by "+this.getWeapon()+"\nHealth reduced: 30.\nRemaining Health: "+this.health);
            if(this.health == 0) System.out.println(this.getName()+" is no more.");
        }
        else {
            System.out.println(this.getName()+" is already dead.");
        }
    }
    public void damageRifle(){
        if(shield && this.health>0){
            this.health -=30;
            if(this.health <0) this.health = 0;
            System.out.println(this.getName()+" have a shield\n"+this.getName()+" got hit by "+this.getWeapon()+"\nHealth reduced: 30.\nRemaining Health: "+this.health);
            if(this.health == 0) System.out.println(this.getName()+" is no more.");
        }
        else if(!shield && this.health>0){
            this.health -=40;
            if(this.health <0) this.health = 0;
            System.out.println(this.getName()+" doesn't have a shield\n"+this.getName()+" got hit by "+this.getWeapon()+"\nHealth reduced: 40.\nRemaining Health: "+this.health);
            if(this.health == 0) System.out.println(this.getName()+" is no more.");
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
