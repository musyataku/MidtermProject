public class Hero extends Character{
    String weapon;
    public Hero(String name, int hp,String weapon){
        super(name,hp);
        //super.name = name;
        //super.hp = hp;
        this.weapon = weapon;
    }
    public void attack(Character target){
        System.out.println(name + "は" + weapon + "で攻撃！" + target.name + "に10のダメージを与えた！" );
        target.hp -= 10;
    }
    public void heal(){
        System.out.println(name + "は回復呪文を唱えた！HPが20回復した！");
        super.hp += 20;
    }
    /*public final boolean isAlive(){
        return this.hp > 0;
    }*/
}
