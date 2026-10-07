package model;

import java.util.ArrayList;

/**
 * Represents a Habitat in the zoo with a name, environment type, and area.
 * A habitat can contain up to 10 animals.
 */
public class Habitat {

    private String name;
    private String environment;
    private double area;

    private ArrayList<Animal> myAnimals;

    /**
     * Constructs a Habitat object with the specified name, environment, and area.
     *
     * @param name        The name of the habitat.
     * @param environment The type of environment in the habitat (e.g., aquatic,
     *                    terrestrial, avian).
     * @param area        The area of the habitat in square meters.
     */
    public Habitat(String name, String environment, double area) {
        this.name = name;
        this.environment = environment;
        this.area = area;

        myAnimals = new ArrayList<Animal>();

    }

    /**
     * Adds an animal to the habitat if there is available space.
     *
     * @param myAnimal The animal to be added to the habitat.
     * @return true if the animal was successfully added, false if the habitat is
     *         full.
     */
    public boolean addAnimal(Animal myAnimal) {

        // TODO

        return false;

    }

    /**
     * Retrieves the name of the habitat.
     *
     * @return The name of the habitat.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the type of environment in the habitat.
     *
     * @return The type of environment in the habitat.
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Retrieves a list of animals in the habitat.
     *
     * This method iterates through the array of animals (`myAnimals`) and
     * concatenates the names of non-null animals into a single string, separated by
     * newlines.
     *
     * @return A string containing the names of all animals in the habitat, each on
     *         a new line.
     */

    public String getAnimalList() {

        String animalList = "";

        // TODO

        return animalList;

    }

    /**
     * Checks if the habitat contains an animal with the specified name.
     *
     * @param animalName The name of the animal to search for.
     * @return {@code true} if the animal is found in the habitat, {@code false}
     *         otherwise.
     */
    public boolean hasAnimal(String animalName) {

        // TODO

        return false;
    }

    /**
     * Retrieves the monthly food cost for a specific animal in the habitat.
     *
     * @param animalName The name of the animal whose monthly food cost is to be
     *                   calculated.
     * @return The monthly food cost of the specified animal as a double, or 0.0 if
     *         the animal is not found.
     */
    public double getAnimalMonthlyFoodCost(String animalName) {

        // TODO

        return 0.0;

    }

}
