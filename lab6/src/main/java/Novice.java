
public class Novice extends Player{
    public Novice(){
        this.setHP(10);
        this.setMP(10);
        this.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    public void attack(Player p){
        p.attacked(getATK());
    }
    public void attacked(double n){
        setHP(getHP() - n);
    }
}
