public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("アベル",100,"銅の剣");
        Slime slime = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");
        hero.showStatus();
        slime.showStatus();
        System.out.println("戦闘開始！");
        hero.attack(slime);
        slime.showStatus();
        slime.attack(hero);
        hero.showStatus();
        hero.heal();
        hero.showStatus();
        hero.attack(slime);
        hero.attack(slime);
        hero.attack(slime);
        hero.showStatus();
        slime.showStatus();
        System.out.println(hero.name + "は生きている:" + hero.isAlive(hero.hp));
        System.out.println(slime.name + "は生きている:" + slime.isAlive(slime.hp));
        Hero partyMember = hero;
        partyMember.hp -= 50;
        System.out.print("partyMember経由でHPを減らした後:");
        hero.showStatus();
    }
}
