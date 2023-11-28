public class Equipment {
    private String Equipment;
    private int equipmentAtk;
    private int equipmentDef;
    private int speedNerf;
    public Equipment(){};

    public Equipment(String Equipment){
        this.Equipment = Equipment;
        if(Equipment=="SwordAndShield") SwordAndShield();
        else if(Equipment=="Axe") Axe();
        else if(Equipment=="Bow") Bow();
        else if(Equipment=="No") noEquipment();
    }
    public void noEquipment(){
        Equipment = "No";
        Hand();
    }
    private void Hand(){
        equipmentAtk = 0;
        equipmentDef = 0;
        speedNerf    = 0;
    }
    private void SwordAndShield(){
        equipmentAtk = 200;
        equipmentDef = 250;
        speedNerf    = -50;
    }
    private void Axe(){
        equipmentAtk = 300;
        equipmentDef = 100;
        speedNerf    = -100;
    }
    private void Bow(){
        equipmentAtk = 400;
        equipmentDef = 0;
        speedNerf    = 0;
    }

    public int getEquipmentAtk(){
        return equipmentAtk;
    }

    public int getEquipmentDef(){
        return equipmentDef;
    }

    public int getSpeedNerf(){
        return speedNerf;
    }

    public String getEquipmentName(){
        return Equipment;
    }

}
