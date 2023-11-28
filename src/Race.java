public class Race {
    private String Race;
    private int baseHP;
    private int baseAtk;
    private int baseDef;
    private int baseSpeed;
    private int baseMana;
    public Race(){}

    public Race(String Race){
        this.Race = Race;
        if(Race=="Human") getHumanStat();
        else if(Race=="Elf") getElfStat();
        else if(Race=="Werewolf") getWerewolfStat();
    }

    private void getHumanStat(){
        baseHP = 30000;
        baseAtk = 300;
        baseDef = 250;
        baseSpeed = 200;
        baseMana = 400;
    }
    private void getElfStat(){
        baseHP = 20000;
        baseAtk = 400;
        baseDef = 200;
        baseSpeed = 400;
        baseMana = 600;
    }

    private void getWerewolfStat(){
        baseHP = 40000;
        baseAtk = 500;
        baseDef = 400;
        baseSpeed = 300;
        baseMana = 200;
    }



    public String getRaceName(){
        return Race;
    }

    public int getBaseHP(){
        return baseHP;
    }

    public int getBaseAtk(){
        return baseAtk;
    }

    public int getBaseDef(){
        return baseDef;
    }

    public int getBaseSpeed(){
        return baseSpeed;
    }

    public int getBaseMana(){
        return baseMana;
    }

}
