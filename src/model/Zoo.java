package model;

import java.util.ArrayList;

/**
 * Represents a Zoo with a name, city, address, budget, and a collection of
 * habitats.
 */
public class Zoo {

    // Atributes
    private String name;
    private String city;
    private String address;
    private double budget;

    // Relations
    private ArrayList<Habitat> myHabitats;

    // Constructor
    /**
     * Constructs a Zoo object with the specified name, city, address, and budget.
     * Initializes an array to store up to 33 habitats.
     *
     * @param name    The name of the zoo.
     * @param city    The city where the zoo is located.
     * @param address The address of the zoo.
     * @param budget  The initial budget of the zoo.
     */
    public Zoo(String name, String city, String address, double budget) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.budget = budget;

        myHabitats = new ArrayList<Habitat>();
    }

    // Analyzers
    /**
     * Retrieves the general information of the zoo, including its name, city,
     * address, and budget.
     *
     * @return A string containing the general information of the zoo in the format:
     *         "name-city-address-budget".
     */
    public String getInformation() {
        return name + "-" + city + "-" + address + "-" + budget;
    }

    /**
     * Adds a new habitat to the zoo. The habitat is created with the specified
     * name, environment, and area. The habitat is added to the first available
     * position in the habitats array.
     *
     * @param name        The name of the habitat.
     * @param environment The type of environment in the habitat (e.g., jungle,
     *                    desert).
     * @param area        The area of the habitat in square meters.
     * @return {@code true} if the habitat was successfully added; {@code false}
     *         if there is no available space in the habitats array.
     */
    public boolean addHabitat(String name, String environment, double area) {

        // TODO

        return false;
    }

    /**
     * Checks if there is at least one available habitat in the zoo.
     * 
     * Precondition: myHabitats array must be initialized.
     *
     * @return {@code true} if there is at least one habitat available;
     *         {@code false} otherwise.
     */
    public boolean hasAvailableHabitat() {

        // TODO

        return false;

    }

    /**
     * Retrieves a list of all habitats in the zoo, including their names and
     * environments.
     *
     * @return A string containing the list of habitats in the format:
     *         "name-environment", with each habitat on a new line.
     */
    public String getHabitatList() {

        String habitatList = "";

        // TODO
        return habitatList;

    }

    /**
     * Adds an animal to a specific habitat in the zoo.
     *
     * @param habitatName  The name of the habitat where the animal will be added.
     * @param name         The name of the animal.
     * @param weight       The weight of the animal in kilograms.
     * @param dietType     The type of diet the animal follows (e.g., herbivore,
     *                     carnivore, omnivore).
     * @param lifeStage    The life stage of the animal (e.g., juvenile, adult,
     *                     senior).
     * @param healthStatus The health status of the animal (e.g., healthy, sick,
     *                     injured).
     * @return {@code true} if the animal was successfully added to the habitat;
     *         {@code false} if the habitat
     *         does not exist or is full.
     */
    public boolean addAnimalInHabitat(String habitatName, String name, double weight, String dietType, String lifeStage,
            String healthStatus) {

        // TODO

        return false;
    }

    /**
     * Retrieves a list of all animals in the zoo.
     *
     * This method iterates through all habitats in the zoo and concatenates the
     * lists of animals from each habitat into a single string, separated by
     * newlines.
     *
     * @return A string containing the names of all animals in the zoo, each on a
     *         new line.
     */
    public String getAllAnimalList() {

        String allAnimalList = "";

        // TODO
        return allAnimalList;
    }

    /**
     * Retrieves the monthly food cost for a specific animal in the zoo.
     *
     * This method searches through all habitats in the zoo to find the specified
     * animal and calculates its monthly food cost.
     *
     * @param animalName The name of the animal whose monthly food cost is to be
     *                   calculated.
     * @return The monthly food cost of the specified animal as a double, or -1 if
     *         the animal is not found.
     */
    public double getMonthlyFoodCostFromAnimal(String animalName) {

        double animalMonthlyFoodCost = -1;

        // TODO

        return animalMonthlyFoodCost;
    }

    // Modifiers
    /**
     * Sets the name of the zoo.
     *
     * @param name The new name of the zoo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the city where the zoo is located.
     *
     * @param city The new city of the zoo.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the address of the zoo.
     *
     * @param address The new address of the zoo.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the budget of the zoo.
     *
     * @param budget The new budget of the zoo.
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

}
