import javax.naming.Name;
import java.util.logging.Level;

public class CharacterStat extends Race {
    private String name;
    private Race Race;
    private Equipment Equipment;
    private int Level = 1;
    private int maxHP = (100*Level)+Race.getBaseHP();
    private double nowHP = maxHP;
    private int charAtk = Race.getBaseAtk()+Equipment.getEquipmentAtk();
    private int charDef = Race.getBaseDef()+Equipment.getEquipmentDef();
    private int maxMana = Race.getBaseMana();
    private int nowMana = maxMana;
    private int Speed = Race.getBaseSpeed()+Equipment.getSpeedNerf();
    private int maxSpeed = (Level*3)+Speed;
    private int nowExp = 0;
    private int maxExp = 100*Level;

    public CharacterStat (String name,String Race){
        this.name = name;
        this.Race = new Race(Race);
        this.Equipment = new Equipment("No");
    }

    public void showCharStat() {
        System.out.println("Name : "+ name);
        System.out.println("Race : "+ Race.getRaceName());
        System.out.println("Level : "+ Level);
        System.out.println("Exp : " + nowExp + " / " + maxExp);
        System.out.println("HP : " + nowHP + " / " + maxHP);
        System.out.println("Mana : " + nowMana + " / " + maxMana);
        System.out.println("Atk : " + charAtk);
        System.out.println("Def : " + charDef);
        System.out.println("Speed/Max Speed : " + Speed + " / " + maxSpeed);
        System.out.println("Equipment : " + Equipment.getEquipmentName());
    }
    public String EquipmentName(){
        return Equipment.getEquipmentName();
    }
}
