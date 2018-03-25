import java.util.*;

public class Pokedex implements PokedexInterface{
    Scanner newPoke = new Scanner(System.in);
    private int arrayLength;
    //Pokemon currentPokemon = new Pokemon();
    public Pokedex(){
        arrayLength = newPoke.nextInt();

    }
    public int getArrayLength(){
        return arrayLength;
    }
    ArrayList<String> allPokemon = new ArrayList<String>(arrayLength);
    public String[] listPokemon(){
        if (allPokemon.isEmpty()){
            System.out.println("Empty");
            System.out.println("");
            return null;

        }

        else{
            for (int i = 0; i < allPokemon.size(); i++){
                System.out.println((i + 1) + ". " + allPokemon.get(i));
                System.out.println();
            }
            return new String[]{allPokemon.toString()};  //  code completion(intellij) changed this for me
        }

    }
    public boolean addPokemon(String species){
        int counter = 1;
        Pokemon currentPokemon = new Pokemon();
        if(allPokemon.contains(species)) {
            System.out.println("Duplicate");
            return false;
            }
        else if(arrayLength <= counter) {
            System.out.println("Max");
            return false;
        }

        else{
            allPokemon.add((counter - 1), species.toLowerCase());
            currentPokemon.setSpecies(species.toLowerCase());
            //currentPokemon.setAttack(1);
            //currentPokemon.setDefense(1);
            //currentPokemon.setSpeed(1);
            counter++;
            return true;
        }



    }
    public int[] checkStats(String species){
        if (!(allPokemon.contains(species))){
            System.out.println("Missing");
            return null;
        }
        else {
            Pokemon currentPokemon = new Pokemon();
            currentPokemon.setSpecies(species);
            //currentPokemon.setAttack(1);
            //currentPokemon.setDefense(1);
            //currentPokemon.setSpeed(1);
            int[] combatStats = new int[3];
            combatStats[0] = currentPokemon.getAttack();
            combatStats[1] = currentPokemon.getDefense();
            combatStats[2] = currentPokemon.getSpeed();
            System.out.println("");
            System.out.println("The stats for " + currentPokemon.getSpecies() + " are:");
            System.out.println("Attack: " + combatStats[0]);
            System.out.println("Defense: " + combatStats[1]);
            System.out.println("Speed: " + combatStats[2]);
            System.out.println("");
            return combatStats;
        }
    }
    public void sortPokedex(){
        Collections.sort(allPokemon, String.CASE_INSENSITIVE_ORDER); // help from stack overflow, CASE_INSENSITIVE_ORDER sorts alphabetically ignoring capitalization
    }
    public boolean evolvePokemon(String species){
        if(allPokemon.contains(species)){
            Pokemon currentPokemon = new Pokemon();
            //currentPokemon.setSpecies(species);
            //currentPokemon.setAttack(1);
            //currentPokemon.setDefense(1);
            //currentPokemon.setSpeed(1);
            int newAttack = currentPokemon.getAttack() * 2;
            currentPokemon.setAttack(newAttack);
            int newDefense = currentPokemon.getDefense() * 4;
            currentPokemon.setDefense(newDefense);
            int newSpeed = currentPokemon.getSpeed() * 3;
            currentPokemon.setSpeed(newSpeed);
            System.out.println(species + " has evolved!");
            return true;
        }
        else{
            System.out.println("Missing");
            return false;
        }
    }

}


