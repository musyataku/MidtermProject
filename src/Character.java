public abstract class Character implements Creature{
    String name;
    int hp;
    public Character(){}
    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public abstract void attack(Character target);
    public final boolean isAlive(){
        if(this.hp>0){
            return true;
        } else {
            return false;
        }
    }
    public void showStatus(){
        System.out.println("[" + name + "]：HP [" + hp + "]");
    }
}
