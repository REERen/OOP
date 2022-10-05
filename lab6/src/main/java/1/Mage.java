public class Mage extends Player{
    public Mage(){
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    public void attack(Player p){
        p.attacked(getATK()*2.5);
        setMP(getMP() - 5);
    }
    public void attacked(double n){
        setHP(getHP() - n);
    }
}
