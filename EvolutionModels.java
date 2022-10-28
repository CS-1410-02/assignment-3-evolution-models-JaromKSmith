public class EvolutionModels{

public static void main(String[] args){

    creature creature = new creature();

    }
}

class world{
    private int[][] position = new int[10][10];

    public int[][] getPosition(){
        return position;
    }

    private void createCreature() {
        
    }
}

interface actions{
    private void move(){}
    private void dance(){}
}

class creature extends world implements actions{
    private int hunger = 1;
    private int direction = 2;
    private int reChance = 3;

    private void die() {
        
    }

    private void reproduce(){

    }

    public int getHunger(){
        return hunger;
    }

    public void move(){

    }

    public String dance(){
        return "Creature is dancing";
    }
}