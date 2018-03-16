/**
Henry Hernandez W3 PRG421 Iterator Program
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator; //Iterator import
import java.util.List;

public class Main {

    private final XO xo = XO.getInstance();

    /**
     * Main program loop
     */
    private void mainLoop() {

        xo.display("****************************************");
        xo.display("|    Collection  of  Animals            |");
        xo.display("|                                       |");
        xo.display("****************************************");

        //

        List<Animal> animalList = new ArrayList<>();
        File animalFile = new File("animals.txt");

        parseAnimalFile(animalFile, animalList);

        displayAnimals(animalList);

    }

    /**
     * Parse animal data file
     * @param animalFile File of animal data
     * @param animalList List of animals
     */
    private void parseAnimalFile(File animalFile, List<Animal> animalList) {


        try(BufferedReader br = new BufferedReader(new FileReader(animalFile))) {

            String line = br.readLine();

            while (line != null) {

                Animal animal = new Animal(line);

                animalList.add(animal);

                line = br.readLine();
            }

        } catch (FileNotFoundException fefe) {

            xo.displayError("Could not find file " + animalFile.getAbsolutePath());

        } catch (IOException e) {

            xo.displayError("Could not process file " + animalFile.getName() + " : " + e.getMessage());

        }

    }

    /**
     * Display each animal within collection via an iterator
     * @param animalList List of animals
     */
    private void displayAnimals(List<Animal> animalList) {

        Iterator itr = animalList.iterator();

        while(itr.hasNext()) {

            Animal animal = (Animal) itr.next();

            xo.display( animal.getName() );

        }

    }


    /**
     * Main program entry point
     *
     * @param args None
     */
    public static void main(String[] args) {

        Main m = new Main();
        m.mainLoop();

    }

}
