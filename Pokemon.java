import java.util.*;

public class Pokemon {
    Scanner myPoke = new Scanner(System.in);
    private String species;
    private int attack;
    private int defense;
    private int speed;
    public Pokemon(){
        species = myPoke.nextLine();
        attack = (species.length() * 7) + 9;
        defense = (species.length() * 5) + 17;
        speed = (species.length() * 6) + 13;
    }
    public void setAttack(int pokeAttack){
        attack = pokeAttack;

    }
    public int getAttack(){
        return attack;
    }
    public void setDefense(int pokeDefense){
        defense = pokeDefense;

    }
    public int getDefense(){
        return defense;
    }
    public void setSpeed(int getSpeed){
        speed = getSpeed;

    }
    public int getSpeed(){
        return speed;
    }
    public void setSpecies(String pokeName){
        species = pokeName;


    }
    public String getSpecies(){
        return species;
    }

}
