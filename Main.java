import java.util.*;

public class Main {
    public static void main(String Args[]){
        Scanner userInput = new Scanner(System.in);
        int menuChoice = 0;
        String pokemonSpecies;
        System.out.println("Welcome to your new PokeDex!");
        System.out.print("How many pokemon are in your region?: ");
        Pokedex myPokedex = new Pokedex();
        System.out.println("");
        System.out.println("Your new Pokedex can hold " + myPokedex.getArrayLength() + " Pokemon. Let's start using it!");
        System.out.println("");
        while(menuChoice != 6){
            System.out.println("1. List Pokemon");
            System.out.println("2. Add Pokemon");
            System.out.println("3. Check a Pokemon's Stats");
            System.out.println("4. Evolve Pokemon");
            System.out.println("5. Sort Pokemon");
            System.out.println("6. Exit");
            System.out.println("");
            System.out.print("What would you like to do? ");
            menuChoice = userInput.nextInt();
            switch(menuChoice){
                case 1:
                    myPokedex.listPokemon();
                    break;
                case 2:
                    System.out.print("Please enter the Pokemon's species: ");
                    myPokedex.addPokemon(userInput.nextLine());
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Please enter the species of interest: ");
                    myPokedex.checkStats(userInput.nextLine());
                    break;
                case 4:
                    System.out.print("Please enter the species of interest: " + userInput.nextLine());
                    pokemonSpecies = userInput.nextLine();
                    myPokedex.evolvePokemon(pokemonSpecies);
                    System.out.println("");
                    break;
                case 5:
                    myPokedex.sortPokedex();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("That is not a valid choice. Try again");



            }

        }

    }

}
